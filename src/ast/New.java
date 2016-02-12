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

@BoaConstructor(fields = { "name", "args" })

public class New extends AST {

  public String name;
  public AST[]  args;

  public New() {
  }

  public New(String name, AST... args) {
    this.name = name;
    this.args = args;
  }

  public String toString() {
    return "New(" + name + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    for (AST a : args)
      a.compile(locals, dynamics, code);
    Local local = lookup(name, locals);
    if (local == null) local = lookup(name, dynamics);
    if (local == null) throw new java.lang.Error("cannot find a behaviour named " + name);
    local.compile(code);
    code.add(new instrs.New());
  }

  public void FV(HashSet<String> vars) {
    for (AST a : args)
      a.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    DV(args, vars);
  }

  public int maxLocals() {
    return maxLocals(args);
  }

}
