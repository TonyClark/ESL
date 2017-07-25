package ast.actors;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;
import values.Located;

@BoaConstructor(fields = { "behaviour" })

public class Become extends AST {

  public AST behaviour;

  public Become() {
  }

  public Become(int lineStart, int lineEnd, AST behaviour) {
    super(lineStart, lineEnd);
    this.behaviour = behaviour;
  }

  public String toString() {
    return "Become(" + behaviour + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    behaviour.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Become(getLineStart()), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    behaviour.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    behaviour.DV(vars);
  }

  public int maxLocals() {
    return behaviour.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Become(getLineStart(), getLineEnd(), behaviour.subst(ast, name));
  }

  public void setPath(String path) {
    behaviour.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    setType(behaviour.type(env));
    return getType();
  }

  public String getLabel() {
    return "become :: " + getType();
  }

}
