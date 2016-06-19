package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "exp" })

public class Not extends AST {

  public AST exp;

  public Not() {
  }

  public Not(AST exp) {
    super();
    this.exp = exp;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    exp.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Not(getLine()), locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    exp.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    exp.FV(vars);
  }

  public int maxLocals() {
    return exp.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Not(exp.subst(ast, name));
  }

  public String toString() {
    return "Not(" + exp + ")";
  }

  public void setPath(String path) {
    exp.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type t = exp.type(env);
    if (t instanceof ast.types.Bool)
      return t;
    else throw new TypeMatchError(this, t, ast.types.Bool.BOOL);
  }

}
