package ast.control;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class Error extends AST {

  AST message;

  public Error(AST message) {
    this.message = message;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    message.compile(locals, dynamics, code, false);
    code.add(new instrs.control.Error(getLine()), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    message.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    message.DV(vars);
  }

  public int maxLocals() {
    return message.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Error(message.subst(ast, name));
  }

  public String toString() {
    return "Error(" + message + ")";
  }

  public void setPath(String path) {
    message.setPath(path);
  }

}
