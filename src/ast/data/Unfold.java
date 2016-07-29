package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.types.Rec;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.StartCall;
import list.List;

@BoaConstructor(fields = { "type", "exp" })

public class Unfold extends AST {

  public Type type;
  public AST  exp;

  public Unfold() {
  }

  public Unfold(int lineStart, int lineEnd, Type type, AST exp) {
    super(lineStart, lineEnd);
    this.type = type;
    this.exp = exp;
  }

  public String toString() {
    return "Unfold(" + type + "," + exp + ")";
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
    return new Unfold(getLineStart(), getLineEnd(), type, exp.subst(ast, name));
  }

  public void setPath(String path) {
    exp.setPath(path);
    type.setPath(path);
  }

  public Rec getRecType(Env<String, Type> env) {
    Type t = type.deref(env);
    if (t instanceof Rec)
      return (Rec)t;
    else throw new TypeError(getLineStart(), getLineEnd(), "expecting a recursive type: " + t);
  }

  public Type type(Env<String, Type> env) {
    Type t = exp.type(env).deref(env);
    if (t instanceof Rec) {
      if (Type.equals(t, getRecType(env), env))
        return getRecType(env).unfold();
      else throw new TypeError(getLineStart(), getLineEnd(), "expecting a value of type " + getRecType(env));
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a recursive type " + t);
  }

  public String getLabel() {
    return "unfold";
  }

}
