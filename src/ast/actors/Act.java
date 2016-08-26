package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.RefContainer;
import ast.binding.declarations.ReferencingLocation;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.HandlerType;
import ast.types.MessageType;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.PopFrame;
import instrs.apply.Return;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "exports", "bindings", "init", "arms" })

public class Act extends AST implements DecContainer, RefContainer {

	static int actCount = 0;

	public static String newName() {
		return "act" + (actCount++);
	}

	String						path;
	public AST				name;
	public Export			exports;
	public Binding[]	bindings;
	public AST				init;
	public BArm[]			arms;

	public Act() {
	}

	public Act(int line, String path, AST name, Export exports, Binding[] bindings, AST init, BArm[] arms) {
		setLineStart(line);
		this.path = path;
		this.name = name;
		this.exports = exports;
		this.bindings = bindings;
		this.init = init;
		this.arms = arms;
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

		// An act definition returns a behaviour. The bindings in the behaviour must
		// be constructed
		// as recursive bindings *and* be dynamic variables so that '.' can find
		// them. Therefore,
		// compile a behaviour as though it were constructed in the context of a
		// letrec, but force
		// the bindings to be dynamic...

		bindings = Binding.mergeBindings(bindings);

		for (Binding b : Binding.valueBindings(bindings)) {
			code.add(new Null(getLineStart()), locals, dynamics);
			code.add(new NewDynamic(getLineStart()), locals, dynamics);
			dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
		}
		for (Binding b : Binding.valueBindings(bindings)) {
			b.getValue().compile(locals, dynamics, code, false);
			code.add(new SetDynamic(b.getValue().getLineStart(), lookup(b.name, dynamics).getIndex()), locals, dynamics);
			code.add(new Pop(b.getValue().getLineStart()), locals, dynamics);
		}
		orderExports(dynamics);
		name.compile(locals, dynamics, code, false);
		compileBehaviour(locals, dynamics, code);

		// Remove the dynamics...
		for (Binding b : Binding.valueBindings(bindings)) {
			code.add(new PopDynamic(getLineStart()), locals, dynamics);
			dynamics = dynamics.getTail();
		}
	}

	public void compileBehaviour(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {

		// Compilation of a behaviour produces a closure-like value that captures
		// the current
		// dynamics and waits to be transformed into an actor via 'new'.

		CodeBox bodyCode = new CodeBox(path, maxLocals() + 1);
		// Message will be local 0 in the stack frame...
		locals = new Nil<FrameVar>().cons(new FrameVar("$0", 0));
		bodyCode.add(new instrs.vars.FrameVar(getLineStart(), 0), locals, dynamics);
		Case handlers = new Case(getFirstHandlerLine(), getLineEnd(), new Dec[] {}, new AST[] {}, arms);
		bodyCode.add(new instrs.patterns.SetPatternValues(getLineStart(), 1), locals, dynamics);
		handlers.compileArms(locals, dynamics, bodyCode, true);
		bodyCode.add(new Return(getLineStart()), locals, dynamics);
		int initIndex = bodyCode.getCode().size();
		init.compile(locals, dynamics, bodyCode, false);
		bodyCode.add(new PopFrame(getLineStart()), locals, dynamics);
		// Set the locals + 1 since the message is the first local...
		code.add(new instrs.data.Behaviour(getLineStart(), toKeys(exports.getStrings()), initIndex, bodyCode), locals, dynamics);
	}

	public void DV(HashSet<String> vars) {
		// Which free vars will need to be dynamic?
		FV(vars);
		for (Binding b : Binding.valueBindings(bindings))
			vars.add(b.getName());
	}

	public void FV(HashSet<String> vars) {
		HashSet<String> bound = new HashSet<String>();
		for (Binding b : Binding.valueBindings(bindings)) {
			bound.add(b.getName());
		}
		for (Binding b : Binding.valueBindings(bindings)) {
			HashSet<String> free = new HashSet<String>();
			b.FV(free);
			free.removeAll(bound);
			vars.addAll(free);
		}
		HashSet<String> free = new HashSet<String>();
		for (BArm arm : arms)
			arm.FV(vars);
		init.FV(vars);
		name.FV(vars);
		free.removeAll(bound);
		vars.addAll(free);
	}

	private Dec[] getExportedTypes(Env<String, Type> env) {
		Dec[] decs = new Dec[exports.getNames().length];
		int decIndex = 0;
		for (Binding b : Binding.valueBindings(bindings)) {
			Env<String, Type> bEnv = env;
			Type bType = b.getDeclaredType();
			if (exports.contains(b.getName())) {
				if (b.getLineStart() == 0 && b.getLineEnd() == 0) {
					System.err.println(b + " has (0,0)");
				}
				decs[decIndex++] = new Dec(b.getLineStart(), b.getLineEnd(), b.getPath(), b.getName(), bType);
			}
		}
		return decs;
	}

	private int getFirstHandlerLine() {
		if (arms.length == 0)
			return -1;
		else return arms[0].patterns[0].getLineStart();
	}

	public String getLabel() {
		return "act " + name + " :: " + getType();
	}

	public int maxLocals() {

		// This does not remove those bindings that will be implemented as
		// dynamic variables, however it is fail safe...

		int maxLocals = name.maxLocals() + init.maxLocals() + Binding.valueBindings(bindings).length;
		for (BArm arm : arms)
			maxLocals += arm.maxLocals();
		int valueLocals = 0;
		for (Binding b : Binding.valueBindings(bindings))
			valueLocals = Math.max(valueLocals, b.getValue().maxLocals());
		return maxLocals + valueLocals;
	}

	private void orderExports(List<DynamicVar> dynamics) {
		ExportedName[] newExports = new ExportedName[dynamics.length()];
		for (ExportedName export : exports.getNames()) {
			if (export != null) {
				DynamicVar dynamic = lookup(export.getName(), dynamics);
				if (dynamic == null)
					throw new java.lang.Error("cannot find dyanamic " + export);
				else newExports[dynamic.getIndex()] = export;
			}
		}
		exports = new Export(exports.getLineStart(), exports.getLineEnd(), newExports);
	}

	private Type selfType(Env<String, Type> env) {

		// The self type is the interface of messages. Create an act
		// type where the handlers all return Void...

		MessageType[] handlers = new MessageType[arms.length];
		int[] index = new int[] { 0 };
		for (int i = 0; i < arms.length; i++) {
			index[0] = i;
			Pattern.types(arms[i].patterns, env, (newEnv, types) -> {
				handlers[index[0]] = new MessageType(getLineStart(), getLineEnd(), types);
			});
		}
		return new ast.types.Act(getLineStart(), getLineEnd(), getExportedTypes(env), handlers);
	}

	public void setPath(String path) {
		this.path = path;
		for (Binding b : bindings)
			b.setPath(path);
		init.setPath(path);
		name.setPath(path);
		for (BArm b : arms)
			b.setPath(path);
	}

	public AST subst(AST ast, String name) {
		return new Act(getLineStart(), path, this.name.subst(ast, name), exports, substBindings(ast, name), init.subst(ast, name), substArms(ast, name));
	}

	private BArm[] substArms(AST ast, String name) {
		BArm[] as = new BArm[arms.length];
		for (int i = 0; i < as.length; i++) {
			as[i] = arms[i].subst(ast, name);
		}
		return as;
	}

	private Binding[] substBindings(AST ast, String name) {
		Binding[] bs = new Binding[bindings.length];
		for (int i = 0; i < bindings.length; i++)
			bs[i] = bindings[i].subst(ast, name);
		return bs;
	}

	private Key[] toKeys(String[] exports) {
		Key[] keys = new Key[exports.length];
		for (int i = 0; i < exports.length; i++)
			if (exports[i] != null) keys[i] = Key.getKey(exports[i]);
		return keys;
	}

	public String toString() {
		return "Act(" + getLineStart() + "," + name + "," + exports + "," + init + "," + Arrays.toString(bindings) + "," + Arrays.toString(arms) + ")";
	}

	public Type type(Env<String, Type> env) {

		// Check the bindings as through they were established in a letrec...

		env = env.bind("self", selfType(env));
		env = Binding.typeBindingsRec(bindings, env);
		init.type(env);
		name.type(env);
		MessageType[] handlers = new MessageType[arms.length];
		for (int i = 0; i < arms.length; i++) {
			HandlerType handlerType = arms[i].type(env);
			handlers[i] = new MessageType(handlerType.getLineStart(), handlerType.getLineEnd(), handlerType.getTypes());
		}
		setType(new ast.types.Act(getLineStart(), getLineEnd(), getExportedTypes(env), handlers));
		return getType();
	}

	public DeclaringLocation[] getContainedDecs() {
		return bindings;
	}

	public ReferencingLocation[] getContainedRefs() {
		ReferencingLocation[] refs = new ReferencingLocation[exports.getNames().length];
		for (int i = 0; i < exports.getNames().length; i++) {
			for (Binding b : bindings) {
				if (b.isTypeBinding())
					refs[i] = new ast.types.Var(getLineStart(), getLineEnd(), b.getName(), null);
				else refs[i] = new ast.binding.Var(getLineStart(), getLineEnd(), b.getName(), null);
			}
		}
		return refs;
	}

}
