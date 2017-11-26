package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Rec;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "type", "exp" })

public class Fold extends AST {

  public Type type;
  public AST  exp;

  public Fold() {
  }

  public Fold(int lineStart, int lineEnd, Type type, AST exp) {
    super(lineStart, lineEnd);
    this.type = type;
    this.exp = exp;
  }

  public String toString() {
    return "Fold(" + type + "," + exp + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    exp.compile(locals, dynamics, code, isLast);
  }

  public void FV(HashSet<String> vars) {
    exp.FV(vars);
  }

  public int maxLocals() {
    return exp.maxLocals();
  }

  public void DV(HashSet<String> vars) {
    exp.DV(vars);
  }

  public AST subst(AST ast, String name) {
    return new Fold(getLineStart(), getLineEnd(), type, exp.subst(ast, name));
  }

  public void setPath(String path) {
    exp.setPath(path);
    type.setPath(path);
  }

  public Rec getRecType(Env<String, Type> env) {
    Type t = type.deref(env);
    if (t instanceof Rec)
      return (Rec) t;
    else throw new TypeError(getLineStart(), getLineEnd(), "expecting a recursive type: " + t);
  }

  public Type type(Env<String, Type> env) {
    Type t = exp.type(env).deref(env);
    if (Type.equals(t, getRecType(env).unfold(), env))
      return getRecType(env);
    else throw new TypeError(getLineStart(), getLineEnd(), "expecting a value of type " + getRecType(env).unfold());
  }

  public String getLabel() {
    return "fold";
  }

}
