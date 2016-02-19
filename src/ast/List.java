package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;

@BoaConstructor(fields = { "elements" })

public class List extends AST {

  public AST[] elements = new AST[] {};

  public List() {
  }

  public List(AST... elements) {
    this.elements = elements;
  }

  public String toString() {
    return "List(" + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, Vector<Instr> code) {
    for (AST e : elements)
      e.compile(locals, dynamics, code);
    code.add(new instrs.List(elements.length));
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

}
