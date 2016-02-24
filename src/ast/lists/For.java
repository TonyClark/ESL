package ast.lists;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.control.Block;
import ast.data.Apply;
import ast.data.Fun;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Goto;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Null;
import instrs.Pop;
import instrs.PopDynamic;
import instrs.SetDynamic;
import instrs.SetFrame;
import instrs.SkipTrue;
import instrs.isNil;
import list.List;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class For extends AST {

  public Pattern pattern;
  public AST     list;
  public AST     body;

  public For() {
  }

  public For(Pattern pattern, AST list, AST body) {
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "For(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (pattern instanceof PVar)
      compileSimple(locals, dynamics, code);
    else desugar().compile(locals, dynamics, code);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, new Block());
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t")) }, new Apply(new Var("$f"), new Var("$t")));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t")) }, new Block(body, new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun("for", new String[] { "l" }, caseExp);
    return new Letrec(new Binding[] { new Binding("$f", fun) }, new Apply(new Var("$f"), list));
  }

  private void compileSimple(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    PVar pvar = (PVar) pattern;
    HashSet<String> DV = new HashSet<String>();
    DV(DV);
    boolean isdynamic = DV.contains(pvar.name);
    if (isdynamic)
      compileSimpleDynamic(locals, dynamics, code);
    else compileSimpleLocal(locals, dynamics, code);
  }

  private void compileSimpleDynamic(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    // [| list |]
    // SETFRAME n
    // POP
    // NULL
    // NEWDYNAMIC
    // LOOP: FRAMEVAR n
    // ISNIL
    // SKIPTRUE END
    // FRAMEVAR n
    // HEAD
    // SETDYNAMIC 0
    // FRAMEVAR n
    // TAIL
    // SETFRAME n
    // POP
    // [| body |]
    // POP
    // GOTO LOOP
    // END: POPDYNAMIC
    // NULL

    PVar pvar = (PVar) pattern;
    list.compile(locals, dynamics, code);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(pvar.name, 0));
    code.add(new SetFrame(locals.length() - 1));
    code.add(new Null());
    code.add(new NewDynamic());
    int loop = code.size();
    code.add(new instrs.FrameVar(locals.length() - 1));
    code.add(new isNil());
    SkipTrue skiptrue = new SkipTrue(0);
    code.add(skiptrue);
    int addr = code.size();
    code.add(new instrs.FrameVar(locals.length() - 1));
    code.add(new instrs.Head());
    code.add(new SetDynamic(0));
    code.add(new instrs.FrameVar(locals.length() - 1));
    code.add(new instrs.Tail());
    code.add(new SetFrame(locals.length() - 1));
    code.add(new Pop());
    body.compile(locals, dynamics, code);
    code.add(new Pop());
    code.add(new Goto(loop));
    code.add(new PopDynamic());
    skiptrue.setCount(code.size() - addr);
    code.add(new Null());
  }

  public void compileSimpleLocal(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // [| list |]
    // SETFRAME n
    // POP
    // LOOP: FRAMEVAR n
    // ISNIL
    // SKPTRUE END
    // FRAMEVAR n
    // HEAD
    // SETFRAME n + 1
    // POP
    // FRAMEVAR n
    // TAIL
    // SETFRAME n
    // POP
    // [| body |]
    // POP
    // GOTO LOOP
    // END: NULL

    PVar pvar = (PVar) pattern;
    list.compile(locals, dynamics, code);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    locals = locals.cons(new FrameVar(pvar.name, locals.length()));
    code.add(new SetFrame(locals.length() - 2));
    int loop = code.size();
    code.add(new instrs.FrameVar(locals.length() - 2));
    code.add(new isNil());
    SkipTrue skiptrue = new SkipTrue(0);
    code.add(skiptrue);
    int addr = code.size();
    code.add(new instrs.FrameVar(locals.length() - 2));
    code.add(new instrs.Head());
    code.add(new SetFrame(locals.length() - 1));
    code.add(new Pop());
    code.add(new instrs.FrameVar(locals.length() - 2));
    code.add(new instrs.Tail());
    code.add(new SetFrame(locals.length() - 2));
    code.add(new Pop());
    body.compile(locals, dynamics, code);
    code.add(new Pop());
    code.add(new Goto(loop));
    code.add(new Null());
    skiptrue.setCount(code.size() - addr);

  }

  public void FV(HashSet<String> vars) {
    if (pattern instanceof PVar) {
      PVar pvar = (PVar) pattern;
      HashSet<String> FV = new HashSet<String>();
      body.FV(FV);
      FV.remove(pvar.name);
      vars.addAll(FV);
      list.FV(vars);
    } else desugar().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    if (pattern instanceof PVar) {
      body.DV(vars);
      list.DV(vars);
    } else desugar().FV(vars);
  }

  public int maxLocals() {
    if (pattern instanceof PVar) {
      return Math.max(list.maxLocals(), body.maxLocals() + 2);
    } else return desugar().maxLocals();
  }

  public AST subst(AST ast, String name) {
    if (pattern instanceof PVar) {
      PVar pvar = (PVar) pattern;
      if (name.equals(pvar.name))
        return this;
      else return new For(pattern, list.subst(ast, name), body.subst(ast, name));
    } else return desugar().subst(ast, name);
  }

}
