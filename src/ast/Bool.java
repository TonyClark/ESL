package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.False;
import instrs.Instr;
import instrs.True;
import list.List;

@BoaConstructor(fields = { "value" })
public class Bool extends AST {

  public boolean value;

  public Bool() {
  }

  public String toString() {
    return "Bool(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (value)
      code.add(new True());
    else code.add(new False());
  }

  public void FV(HashSet<String> vars) {
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

}
