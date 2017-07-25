package ast.data;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "value" })
public class Int extends AST {

  public int value;

  public Int() {
  }

  public Int(int value) {
    super();
    this.value = value;
  }

  public String toString() {
    return Integer.toString(value);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.data.Int(getLineStart(), value), locals, dynamics);
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
    return getType();
  }

  public String getLabel() {
    return  value + "";
  }

}
