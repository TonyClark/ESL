package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class TermRef extends AST {

  AST term;
  int index;

  public TermRef(AST term, int index) {
    super();
    this.term = term;
    this.index = index;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    term.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.TermRef(getLine(),index), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    term.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    term.DV(vars);
  }

  public int maxLocals() {
    return term.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new TermRef(term.subst(ast, name), index);
  }

  public String toString() {
    return "TermRef(" + term + "," + index + ")";
  }

  public void setPath(String path) {
    term.setPath(path);
  }

}
