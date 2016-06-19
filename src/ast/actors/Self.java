package ast.actors;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = {})
public class Self extends AST {

  public Self() {
  }

  public String toString() {
    return "Self(" + getLine() + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.vars.Self(getLine()), locals, dynamics);
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
    if (env.binds("self"))
      return env.lookup("self");
    else throw new TypeError(this, "cannot find the type of self.");
  }

}
