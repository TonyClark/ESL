package ast.binding;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "name" })
public class Var extends AST {

  public String name;

  public Var() {
  }

  public Var(String name) {
    this.name = name;
  }

  public String toString() {
    return "Var(" + name + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (lookup(name, locals) != null)
      lookup(name, locals).compile(code);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).compile(code);
    else throw new java.lang.Error("cannot find declaration for variable " + name);
  }

  public void FV(HashSet<String> vars) {
    vars.add(name);
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

}
