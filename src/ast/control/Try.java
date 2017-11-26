package ast.control;

import java.util.Arrays;
import java.util.HashSet;

import ast.binding.Dec;
import ast.binding.Var;
import ast.data.Fun;
import ast.data.Str;
import ast.general.AST;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "body", "arms" })

public class Try extends AST {

  static int    tryCount   = 0;
  static int    catchCount = 0;

  public String path;
  public AST    body;
  public BArm[] arms       = new BArm[] {};

  public Try() {
  }

  public Try(int lineStart, int lineEnd, String path, AST body, BArm[] arms) {
    super(lineStart, lineEnd);
    this.path = path;
    this.body = body;
    this.arms = arms;
  }

  public String toString() {
    return "Try(" + body + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // try e catch p1 -> e1; ...
    // is implemented as a closure in a new frame for the scope of e.
    // It is equivalent to a call of fun() e where the new stack frame
    // includes fun(v) case v p1 -> e1 ... as the catch closure. If
    // a value is ever thrown then the stack is unwound up to the
    // most recent catch closure whose stack frame is popped and the
    // catch closure is called.

    desugarCatch().compile(locals, dynamics, code, false);
    desugarBody().compile(locals, dynamics, code, false);
    code.add(new instrs.control.Try(getLineStart()), locals, dynamics);
  }

  public AST desugarBody() {
    return new Fun(getLineStart(), getLineEnd(), path, tryBodyName(), new Dec[] {}, ast.types.Void.VOID, body, false);
  }

  private AST tryBodyName() {
    return new Str("try-body" + (tryCount++));
  }

  public AST desugarCatch() {
    return new Fun(getLineStart(), getLineEnd(), path, catchName(), new Dec[] { new Dec(getLineStart(), getLineEnd(), path, "$1", ast.types.Void.VOID) }, ast.types.Void.VOID, new Case(getLineStart(), getLineEnd(), new Dec[] {}, new AST[] { new Var(getLineStart(), getLineEnd(), "$1", null, null) }, arms), false);
  }

  private AST catchName() {
    return new Str("catch" + (catchCount++));
  }

  public void FV(HashSet<String> vars) {
    desugarBody().FV(vars);
    desugarCatch().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    desugarBody().DV(vars);
    desugarCatch().DV(vars);
  }

  public int maxLocals() {
    return 0;
  }

  public AST subst(AST ast, String name) {
    return new Try(getLineStart(), getLineEnd(), path, body.subst(ast, name), substArms(ast, name));
  }

  private BArm[] substArms(AST ast, String name) {
    BArm[] as = new BArm[arms.length];
    for (int i = 0; i < arms.length; i++)
      as[i] = arms[i].subst(ast, name);
    return as;
  }

  public void setPath(String path) {
    this.path = path;
    body.setPath(path);
    for (BArm arm : arms)
      arm.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    setType(body.type(env));
    return getType();
  }

  public String getLabel() {
    return "try :: " + getType();
  }

}
