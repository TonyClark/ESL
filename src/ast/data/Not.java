package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "exp" })

public class Not extends AST {

  public AST exp;

  public Not() {
  }

  public Not(int lineStart, int lineEnd, AST exp) {
    super(lineStart, lineEnd);
    this.exp = exp;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    exp.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Not(getLineStart()), locals, dynamics);
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
    return new Not(getLineStart(), getLineEnd(), exp.subst(ast, name));
  }

  public String toString() {
    return "Not(" + exp + ")";
  }

  public void setPath(String path) {
    exp.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type t = exp.type(env);
    setType(t);
    if (t instanceof ast.types.Bool)
      return t;
    else throw new TypeMatchError(exp.getLineStart(), exp.getLineEnd(), t, ast.types.Bool.BOOL);
  }

  public String getLabel() {
    return "not :: " + getType();
  }

}
