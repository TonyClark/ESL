package ast.control;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Var;
import ast.data.Fun;
import ast.tests.BArm;
import ast.tests.Case;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "value" })

public class Throw extends AST {

  public AST value;

  public Throw() {
  }

  public Throw(AST value) {
    this.value = value;
  }

  public String toString() {
    return "Throw(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    value.compile(locals, dynamics, code);
    code.add(new instrs.Throw());
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
    return new Throw(value.subst(ast, name));
  }

}
