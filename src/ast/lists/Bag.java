package ast.lists;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;

@BoaConstructor(fields = { "elements" })

public class Bag extends AST {

  public AST[] elements = new AST[] {};

  public Bag() {
  }

  public Bag(AST... elements) {
    this.elements = elements;
  }

  public String toString() {
    return "Bag(" + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST e : elements)
      e.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Bag(getLine(),elements.length), locals, dynamics);
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
    return new Bag(subst(elements, ast, name));
  }

  public void setPath(String path) {
    for (AST element : elements)
      element.setPath(path);
  }

}
