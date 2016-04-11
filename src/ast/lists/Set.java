package ast.lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;

@BoaConstructor(fields = { "elements" })

public class Set extends AST {

  public AST[] elements = new AST[] {};

  public Set() {
  }

  public Set(AST... elements) {
    this.elements = elements;
  }

  public String toString() {
    return "Set(" + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    for (AST e : elements)
      e.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Set(elements.length));
  }

  public void FV(HashSet<String> vars) {
    for (AST e : elements)
      e.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    DV(elements, vars);
  }

  public int maxLocals() {
    return maxLocals(elements);
  }

  public AST subst(AST ast, String name) {
    return new Set(subst(elements, ast, name));
  }

}
