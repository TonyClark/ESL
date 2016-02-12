package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "exp", "qualifiers" })

public class Cmp extends AST {

  public AST         exp;
  public Qualifier[] qualifiers;

  public Cmp() {
  }

  public String toString() {
    return "Cmp(" + exp + "," + Arrays.toString(qualifiers) + ")";
  }

  @Override
  public void compile(List<FrameVar> locals, List<DynamicVar> types, Vector<Instr> code) {
    // TODO Auto-generated method stub

  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Qualifier q : qualifiers) {
      HashSet<String> free = new HashSet<String>();
      q.FV(free);
      free.removeAll(bound);
      vars.addAll(free);
      q.vars(bound);
    }
    HashSet<String> free = new HashSet<String>();
    exp.FV(free);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public void DV(HashSet<String> vars) {
    throw new java.lang.Error("Cmp.DV not implemented.");
  }

  public int maxLocals() {
    throw new java.lang.Error("Cmp.maxLocals not implemented.");
  }

}
