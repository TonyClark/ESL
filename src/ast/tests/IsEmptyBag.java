package ast.tests;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class IsEmptyBag extends AST {

  AST value;

  public IsEmptyBag(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    value.compile(locals, dynamics, code, false);
    code.add(new instrs.tests.IsEmptyBag(getLineStart()), locals, dynamics);
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
    return new IsEmptyBag(value.subst(ast, name));
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    value.type(env);
    return ast.types.Bool.BOOL;
  }

  public String getLabel() {
    return "IsEmptyBag :: " + getType();
  }

}
