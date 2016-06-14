package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = {})
public class Null extends AST {

  public Null() {
  }

  public String toString() {
    return "Null";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.data.Null(getLine()), locals, dynamics);
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
