package ast.tests;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class IsCons extends AST {

  AST value;

  public IsCons(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (isLocal(locals))
      compileLocalIsCons(locals, dynamics, code);
    else if (isDynamic(dynamics))
      compileDynamicIsCons(locals, dynamics, code);
    else {
      value.compile(locals, dynamics, code, false);
      code.add(new instrs.tests.IsCons(getLine()), locals, dynamics);
    }
  }

  private boolean isDynamic(List<DynamicVar> dynamics) {
    if (value instanceof Var) {
      Var v = (Var) value;
      return lookup(v.name, dynamics) != null;
    } else return false;
  }

  private void compileLocalIsCons(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    Var v = (Var) value;
    lookup(v.name, locals).isCons(getLine(), code, locals, dynamics);
  }

  private void compileDynamicIsCons(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    Var v = (Var) value;
    lookup(v.name, dynamics).isCons(getLine(), code, locals, dynamics);
  }

  private boolean isLocal(List<FrameVar> locals) {
    if (value instanceof Var) {
      Var v = (Var) value;
      return lookup(v.name, locals) != null;
    } else return false;
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
    return new IsCons(value.subst(ast, name));
  }

  public String toString() {
    return "IsCons(" + value + ")";
  }

  public void setPath(String path) {
    value.setPath(path);
  }

}
