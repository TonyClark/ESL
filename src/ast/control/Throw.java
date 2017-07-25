package ast.control;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "type", "value" })

public class Throw extends AST {

  public Type type;
  public AST  value;

  public Throw() {
  }

  public Throw(int lineStart, int lineEnd, Type type, AST value) {
    super(lineStart, lineEnd);
    this.type = type;
    this.value = value;
  }

  public String toString() {
    return "Throw(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    value.compile(locals, dynamics, code, false);
    code.add(new instrs.control.Throw(getLineStart()), locals, dynamics);
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
    return new Throw(getLineStart(), getLineEnd(), type, value.subst(ast, name));
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    value.type(env);
    setType(type);
    return type;
  }

  public String getLabel() {
    return "throw :: " + getType();
  }

}
