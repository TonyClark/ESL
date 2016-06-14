package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "value" })
public class Str extends AST {

  public String value;

  public Str() {
  }

  public Str(String value) {
    this.value = value;
  }

  public String toString() {
    return "Str(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.data.Str(getLine(),value),locals, dynamics);
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

}
