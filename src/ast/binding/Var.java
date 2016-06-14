package ast.binding;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name" })
public class Var extends AST {

  public String name;

  public Var() {
  }

  public Var(String name) {
    this.name = name;
  }

  public String toString() {
    return "Var(" + getLine() + "," + name + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (lookup(name, locals) != null)
      lookup(name, locals).compile(getLine(), code, locals, dynamics);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).compile(getLine(), code, locals, dynamics);
    else throw new java.lang.Error("cannot find declaration for variable " + name);
  }

  public void FV(HashSet<String> vars) {
    vars.add(name);
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

  public AST subst(AST ast, String name) {
    ;
    if (this.name.equals(name))
      return ast;
    else return this;
  }

  public void setPath(String path) {
  }

}
