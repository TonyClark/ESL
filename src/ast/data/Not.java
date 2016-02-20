package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "exp" })

public class Not extends AST {

  public AST exp;

  public Not() {
  }

  public String toString() {
    return "Not(" + exp + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    exp.compile(locals, dynamics, code);
    code.add(new instrs.Not());
  }

  public void FV(HashSet<String> vars) {
    exp.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    exp.DV(vars);
  }

  public int maxLocals() {
    return exp.maxLocals();
  }

}
