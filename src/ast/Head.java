package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class Head extends AST {

  AST value;

  public Head(AST value) {
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    value.compile(locals, dynamics, code);
    code.add(new instrs.Head());
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

}
