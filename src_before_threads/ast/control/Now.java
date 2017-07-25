package ast.control;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = {})
public class Now extends AST {

  public Now() {
  }

  public String toString() {
    return "Now";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.vars.Now(getLineStart()), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

  public AST subst(AST ast, String name) {
    return this;
  }

  public void setPath(String path) {
  }

  public Type type(Env<String, Type> env) {
    setType(ast.types.Int.INT);
    return ast.types.Int.INT;
  }

  public String getLabel() {
    return "now :: " + getType();
  }

}
