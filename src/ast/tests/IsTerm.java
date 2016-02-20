package ast.tests;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class IsTerm extends AST {

  AST    value;
  String name;
  int    arity;

  public IsTerm(AST value, String name, int arity) {
    super();
    this.value = value;
    this.name = name;
    this.arity = arity;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    value.compile(locals, dynamics, code);
    code.add(new instrs.IsTerm(name, arity));
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

  public String toString() {
    return "IsTerm(" + value + "," + name + "," + arity + ")";
  }

  public AST subst(AST ast, String name) {
    return new IsTerm(value.subst(ast, name), name, arity);
  }

}
