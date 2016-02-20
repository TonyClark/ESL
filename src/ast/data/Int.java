package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "value" })
public class Int extends AST {

  public int value;

  public Int() {
  }

  public Int(int value) {
    super();
    this.value = value;
  }

  public String toString() {
    return "Int(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    code.add(new instrs.Int(value));
  }

  public void FV(HashSet<String> vars) {
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

}
