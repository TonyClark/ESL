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

@BoaConstructor(fields = { "name", "values" })

public class Become extends AST {

  public String name;
  public AST[]  values;

  public Become() {
  }

  public String toString() {
    return "Become(" + name + "," + Arrays.toString(values) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    Local local = null;
    local = lookup(name, locals);
    if (local != null) local = lookup(name, dynamics);

    if (local == null) throw new java.lang.Error("no type named " + name);

    for (AST value : values)
      value.compile(locals, dynamics, code);
    local.compile(code);
    code.addElement(new instrs.Become(values.length));
  }

  public void FV(HashSet<String> vars) {
    for (AST value : values)
      value.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (AST value : values)
      value.DV(vars);
  }

  public int maxLocals() {
    return maxLocals(values);
  }

}
