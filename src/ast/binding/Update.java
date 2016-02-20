package ast.binding;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "name", "value" })

public class Update extends AST {

  public String name;
  public AST    value;

  public Update() {
  }

  public Update(String name, AST value) {
    super();
    this.name = name;
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    value.compile(locals, dynamics, code);
    if (lookup(name, locals) != null)
      lookup(name, locals).update(code);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).update(code);
    else throw new java.lang.Error("cannot update " + name);
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public int maxLocals() {
    return value.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Update(name,value.subst(ast, name));
  }

  public String toString() {
    return "Update(" + name + "," + value + ")";
  }

}
