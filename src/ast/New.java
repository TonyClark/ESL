package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "behaviour" })

public class New extends AST {

  public AST behaviour;

  public New() {
  }

  public New(AST behaviour) {
    this.behaviour = behaviour;
  }

  public String toString() {
    return "New(" + behaviour + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    behaviour.compile(locals, dynamics, code);
    code.add(new instrs.New());
  }

  public void FV(HashSet<String> vars) {
    behaviour.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    behaviour.DV(vars);
  }

  public int maxLocals() {
    return behaviour.maxLocals();
  }

}
