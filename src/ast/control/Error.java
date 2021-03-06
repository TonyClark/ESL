package ast.control;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class Error extends AST {

  AST message;

  public Error(int lineStart, int lineEnd, AST message) {
    super(lineStart, lineEnd);
    this.message = message;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    message.compile(locals, dynamics, code, false);
    code.add(new instrs.control.Error(getLineStart()), locals, dynamics);
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
    return new Error(getLineStart(), getLineEnd(), message.subst(ast, name));
  }

  public String toString() {
    return "Error(" + message + ")";
  }

  public void setPath(String path) {
    message.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    setType(ast.types.Void.VOID);
    return getType();
  }

  public String getLabel() {
    return "error :: " + getType();
  }

}
