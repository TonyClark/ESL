package ast.tests;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class IsEmptyBag extends AST {

  AST value;

  public IsEmptyBag(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    value.compile(locals, dynamics, code, false);
    code.add(new instrs.tests.IsEmptyBag(getLine()), locals, dynamics);
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

}
