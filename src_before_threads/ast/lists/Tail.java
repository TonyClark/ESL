package ast.lists;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class Tail extends AST {

  AST value;

  public Tail(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    value.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Tail(getLineStart()), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public int maxLocals() {
    return value.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Tail(value.subst(ast, name));
  }

  public String toString() {
    return "Tail(" + value + ")";
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = value.type(env);
    if (type instanceof ast.types.List) {
      setType(type);
      return getType();
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a list type " + type);
  }

  public String getLabel() {
    return "tail :: " + getType();
  }

}
