package ast.lists;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;

public class Head extends AST {

  AST value;

  public Head(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    value.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Head(getLine()), locals, dynamics);
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
    return new Head(value.subst(ast, name));
  }

  public String toString() {
    return "Head(" + value + ")";
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = value.type(env);
    if (type instanceof ast.types.List) {
      ast.types.List list = (ast.types.List) type;
      return list.getType();
    } else throw new TypeError(this, "expecting a list type " + type);
  }

}
