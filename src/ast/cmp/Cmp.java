package ast.cmp;

import java.util.Arrays;
import java.util.HashSet;

import ast.binding.Binding;
import ast.binding.Let;
import ast.binding.Update;
import ast.binding.Var;
import ast.control.Block;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Ref;
import ast.general.AST;
import ast.lists.Flatten;
import ast.lists.For;
import ast.patterns.PVar;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Pop;
import instrs.jumps.Goto;
import instrs.jumps.SkipTrue;
import instrs.ops.Add1;
import instrs.ops.Cons;
import instrs.ops.Eql;
import instrs.ops.Reverse;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetFrame;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "exp", "qualifiers" })

public class Cmp extends AST {

	public AST					exp;
	public Qualifier[]	qualifiers;

	public Cmp() {
	}

	public Cmp(int start, int end, AST exp, Qualifier[] qualifiers) {
		super(start, end);
		this.exp = exp;
		this.qualifiers = qualifiers;
	}

	public String toString() {
		return "Cmp(" + exp + "," + Arrays.toString(qualifiers) + ")";
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		if (isIterationOverInts())
			compileIterationOverInts(locals, dynamics, code, isLast);
		else
			desugar().compile(locals, dynamics, code, isLast);
	}

	private void compileIterationOverInts(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		// Compile a simple comprehension of the form: [ e | i <- n..m ] to a loop...
		HashSet<String> DV = new HashSet<String>();
		BQual bind = (BQual) qualifiers[0];
		PVar var = (PVar) bind.getPattern();
		String name = var.getName();
		BinExp b = (BinExp) bind.getExp();
		AST lower = b.getLeft();
		AST upper = b.getRight();
		Local i = null;
		exp.DV(DV);

		// Bind the iteration variable to the lower value.
		// Careful in case it is a dynamic variable...

		lower.compile(locals, dynamics, code, isLast);
		if (DV.contains(name)) {
			i = new DynamicVar(name, 0);
			code.add(new NewDynamic(getLineStart()), locals, dynamics);
			dynamics = dynamics.map(DynamicVar::incDynamic).cons((DynamicVar) i);
		} else {
			i = new FrameVar(name, locals.length());
			locals = locals.cons((FrameVar) i);
			code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
			code.add(new Pop(getLineStart()), locals, dynamics);
		}

		// Bind the locals containing the list and upper limits...
		code.add(new instrs.data.List(bind.getLineStart(), 0), locals, dynamics);
		FrameVar l = new FrameVar("$l", locals.length());
		locals = locals.cons(l);
		code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
		code.add(new Pop(getLineStart()), locals, dynamics);

		// n..m is inclusive at both ends...
		upper.compile(locals, dynamics, code, isLast);
		code.add(new Add1(getLineStart()), locals, dynamics);
		FrameVar m = new FrameVar("$m", locals.length());
		locals = locals.cons(m);
		code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
		code.add(new Pop(getLineStart()), locals, dynamics);

		// Code is:
		// LAB1: FRAMEVAR(m)
		// GETVAR(i)
		// EQL
		// JMPTRUE LAB2
		// [| e |]
		// FRAMEVAR(l)
		// CONS
		// SETFRAME(l)
		// GETVAR(i)
		// ADD1
		// SETVAR(i)
		// GOTO LAB1
		// LAB2: FRAMEVAR(i)
		// REVERSE

		int lab1 = code.getCode().size();
		m.compile(getLineStart(), code, locals, dynamics);
		i.compile(getLineStart(), code, locals, dynamics);
		code.add(new Eql(getLineStart()), locals, dynamics);
		int lab2 = code.getCode().size();
		SkipTrue jmp1 = new SkipTrue(getLineStart(), 0);
		code.add(jmp1, locals, dynamics);

		exp.compile(locals, dynamics, code, isLast);
		l.compile(getLineStart(), code, locals, dynamics);
		code.add(new Cons(getLineStart()), locals, dynamics);
		l.update(getLineStart(), code, locals, dynamics);
		code.add(new Pop(getLineStart()), locals, dynamics);

		i.compile(getLineStart(), code, locals, dynamics);
		code.add(new Add1(getLineStart()), locals, dynamics);
		i.update(getLineStart(), code, locals, dynamics);
		code.add(new Pop(getLineStart()), locals, dynamics);

		code.add(new Goto(getLineStart(), lab1), locals, dynamics);
		jmp1.setCount(code.getCode().size() - lab2);
		l.compile(getLineStart(), code, locals, dynamics);
		code.add(new Reverse(getLineStart()), locals, dynamics);

		// Remove the dynamics...
		if (DV.contains(name)) {
			code.add(new PopDynamic(getLineStart()), locals, dynamics);
			dynamics = dynamics.getTail();
		}
	}

	public boolean isIterationOverInts() {
		if (qualifiers.length == 1) {
			if (qualifiers[0] instanceof BQual) {
				BQual qual = (BQual) qualifiers[0];
				if (isRange(qual.getExp()))
					return qual.getPattern() instanceof PVar;
				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	public boolean isSimple() {
		for (Qualifier q : qualifiers) {
			if (q instanceof BQual) {
				BQual b = (BQual) q;
				if (!b.isSimple()) return false;
			} else
				return false;
		}
		return true;
	}

	private boolean isRange(AST exp) {
		if (exp instanceof BinExp) {
			BinExp b = (BinExp) exp;
			return b.getOp().equals("..");
		} else
			return false;
	}

	private AST desugar() {

		// A comprehension [e | p1 <- e1 ] produces: flatten(for p1 in e1 -> [e])
		// A comprehension [e | p1 <- e1, p2 <- e2] produces: flatten(for p1 in e1 ->
		// flatten(for p2 in e2 -> e)
		// A comprehension [e | p1 <- e1, ?p] produces: flatten(for p1 in e1 ->
		// flatten(if p then [[e]] else []))

		return desugar(0);
	}

	private AST desugarSimple() {

		// A simple comprehension [ e | v1::T1 <- l1, v2::T2 <- l2, ..., vj::Tj <-
		// lj]::[T]
		// produces
		// let acc::T = [][T]
		// in {
		// for v1::T1 in l1 do
		// for v2::T2 in l2 do
		// ...
		// for vj::Tj in lj do
		// acc := e:acc
		// reverse[T](acc);
		// }

		String varName = "$acc" + System.currentTimeMillis();
		Binding[] bindings = new Binding[1];
		bindings[0] = new Binding(getLineStart(), getLineEnd(), "", varName, getType(), getType(),new ast.lists.List());
		Apply apply = new Apply(getLineStart(), getLineEnd(), "", new Ref(-1, -1, new Var(-1, -1, "new_esl/tmp/lists.esl", null, null), Key.getKey("reverse")),
		    new Var(-1, -1, varName, null, null));
		Let let = new Let(getLineStart(), getLineEnd(), bindings, new Block(getLineStart(), getLineEnd(), simpleForLoops(varName, 0), apply));
		return let;
	}

	private AST simpleForLoops(String v, int i) {
		if (i == qualifiers.length)
			return new Update(-1, -1, v, new BinExp(-1, -1, exp, ":", new Var(-1, -1, v, null, null)));
		else {
			BQual q = (BQual) qualifiers[i];
			return new For(-1, -1, "", q.pattern, q.exp, simpleForLoops(v, i + 1));
		}
	}

	private AST desugar(int i) {
		if (i == qualifiers.length)
			return new ast.lists.List(getLineStart(), getLineEnd(), exp);
		else if (i + 1 == qualifiers.length)
			return qualifiers[i].desugar(exp);
		else
			return new Flatten(qualifiers[i].desugar(desugar(i + 1)));
	}

	public void FV(HashSet<String> vars) {
		desugar().FV(vars);
	}

	public void DV(HashSet<String> vars) {
		desugar().DV(vars);
	}

	public int maxLocals() {
		if (isIterationOverInts()) {
			// Locals for lower, upper, list, and named variable...
			return exp.maxLocals() + 4;
		} else {
			return desugar().maxLocals();
		}
	}

	public AST subst(AST ast, String name) {
		if (isIterationOverInts()) {
			return substIterationOverInts(ast, name);
		} else if (isSimple())
			return substSimple(ast, name);
		else
			return desugar().subst(ast, name);
	}

	private AST substSimple(AST ast, String name) {
		Qualifier[] qs = new Qualifier[qualifiers.length];
		boolean seen = false;
		for (int i = 0; i < qs.length; i++) {
			if (seen)
				qs[i] = qualifiers[i];
			else {
				BQual b = (BQual) qualifiers[i];
				PVar p = (PVar) b.pattern;
				if (p.name.equals(name)) seen = true;
				qs[i] = new BQual(-1, -1, p, b.exp.subst(ast, name));
			}
		}
		if (seen)
			return new Cmp(getLineStart(), getLineEnd(), exp, qs);
		else
			return new Cmp(getLineStart(), getLineEnd(), exp.subst(ast, name), qs);
	}

	private AST substIterationOverInts(AST ast, String name) {
		BQual bind = (BQual) qualifiers[0];
		PVar var = (PVar) bind.getPattern();
		if (name.equals(var.getName()))
			return new Cmp(getLineStart(), getLineEnd(), exp, new Qualifier[] { bind.subst(ast, name) });
		else
			return new Cmp(getLineStart(), getLineEnd(), exp.subst(ast, name), new Qualifier[] { bind.subst(ast, name) });
	}

	public void setPath(String path) {
		for (Qualifier q : qualifiers)
			q.setPath(path);
		exp.setPath(path);
	}

	public Type type(Env<String, Type> env) {
		for (Qualifier q : qualifiers) {
			env = q.bind(env);
		}
		return new ast.types.List(getLineStart(), getLineEnd(), exp.type(env));
	}

	public String getLabel() {
		return "cmp :: " + getType();
	}

}
