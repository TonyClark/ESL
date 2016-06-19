package ast.control;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
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

  public Type type(Env<String, Type> env) {
    Type type = message.type(env);
    if (type.equals(ast.types.Str.STR))
      return ast.types.Void.VOID;
    else throw new TypeError(this, "error messages should be strings");

  }

}
