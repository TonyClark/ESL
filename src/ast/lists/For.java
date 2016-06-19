package ast.lists;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.control.Block;
import ast.data.Apply;
import ast.data.Bool;
import ast.data.Fun;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.jumps.Goto;
import instrs.jumps.SkipTrue;
import instrs.tests.isNil;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
import instrs.vars.SetFrame;
import list.List;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class For extends AST {

  static int     forCount = 0;

  String         path;
  public Pattern pattern;
  public AST     list;
  public AST     body;

  public For() {
  }

  public For(String path, Pattern pattern, AST list, AST body) {
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "For(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (pattern instanceof PVar)
      compileSimple(locals, dynamics, code);
    else desugar().compile(locals, dynamics, code, isLast);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, Bool.TRUE, new Block());
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t", new ast.types.Void())) }, Bool.TRUE, new Apply(new Var("$f"), new Var("$t")));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t", new ast.types.Void())) }, Bool.TRUE, new Block(body, new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun(path, forName(), new Dec[] { new Dec(path, "l", ast.types.Void.VOID) }, ast.types.Void.VOID, caseExp);
    return new Letrec(getLine(), new Binding[] { new Binding(path, "$f", new ast.types.Void(), fun) }, new Apply(new Var("$f"), list));
  }

  private String forName() {
    return "for" + (forCount++);
  }

  private void compileSimple(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    PVar pvar = (PVar) pattern;
    HashSet<String> DV = new HashSet<String>();
    DV(DV);
    boolean isdynamic = DV.contains(pvar.name);
    if (isdynamic)
      compileSimpleDynamic(locals, dynamics, code);
    else compileSimpleLocal(locals, dynamics, code);
  }

  private void compileSimpleDynamic(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
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
    list.compile(locals, dynamics, code, false);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    code.add(new SetFrame(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new Null(getLine()), locals, dynamics);
    code.add(new NewDynamic(getLine()), locals, dynamics);
    dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(pvar.name, 0));
    int loop = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new isNil(getLine()), locals, dynamics);
    SkipTrue skiptrue = new SkipTrue(getLine(), 0);
    code.add(skiptrue, locals, dynamics);
    int addr = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new instrs.ops.Head(getLine()), locals, dynamics);
    code.add(new SetDynamic(getLine(), 0), locals, dynamics);
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new instrs.ops.Tail(getLine()), locals, dynamics);
    code.add(new SetFrame(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLine()), locals, dynamics);
    body.compile(locals, dynamics, code, false);
    code.add(new Pop(getLine()), locals, dynamics);
    code.add(new Goto(getLine(), loop), locals, dynamics);
    code.add(new PopDynamic(getLine()), locals, dynamics);
    dynamics = dynamics.getTail();
    skiptrue.setCount(code.getCode().size() - addr);
    code.add(new Null(getLine()), locals, dynamics);
  }

  public void compileSimpleLocal(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {

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
    list.compile(locals, dynamics, code, false);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    locals = locals.cons(new FrameVar(pvar.name, locals.length()));
    code.add(new SetFrame(getLine(), locals.length() - 2), locals, dynamics);
    int loop = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 2), locals, dynamics);
    code.add(new isNil(getLine()), locals, dynamics);
    SkipTrue skiptrue = new SkipTrue(getLine(), 0);
    code.add(skiptrue, locals, dynamics);
    int addr = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 2), locals, dynamics);
    code.add(new instrs.ops.Head(getLine()), locals, dynamics);
    code.add(new SetFrame(getLine(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLine()), locals, dynamics);
    code.add(new instrs.vars.FrameVar(getLine(), locals.length() - 2), locals, dynamics);
    code.add(new instrs.ops.Tail(getLine()), locals, dynamics);
    code.add(new SetFrame(getLine(), locals.length() - 2), locals, dynamics);
    code.add(new Pop(getLine()), locals, dynamics);
    body.compile(locals, dynamics, code, false);
    code.add(new Pop(getLine()), locals, dynamics);
    code.add(new Goto(getLine(), loop), locals, dynamics);
    code.add(new Null(getLine()), locals, dynamics);
    skiptrue.setCount(code.getCode().size() - addr);

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
      else return new For(path, pattern, list.subst(ast, name), body.subst(ast, name));
    } else return desugar().subst(ast, name);
  }

  public void setPath(String path) {
    this.path = path;
    list.setPath(path);
    body.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    return ast.types.Void.VOID;
  }

}
