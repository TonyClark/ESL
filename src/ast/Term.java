package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "name", "values" })

public class Term extends AST {

  public String name;
  public AST[]  values;

  public Term() {
  }

  public String toString() {
    return "Term(" + name + "," + Arrays.toString(values) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    for (AST value : values)
      value.compile(locals, dynamics, code);
    code.add(new instrs.Term(name, values.length));
  }

  public void FV(HashSet<String> vars) {
    for (AST v : values)
      v.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    DV(values, vars);
  }

  public int maxLocals() {
    return maxLocals(values);
  }

}
