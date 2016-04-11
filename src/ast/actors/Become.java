package ast.actors;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "behaviour" })

public class Become extends AST {

  public AST behaviour;

  public Become() {
  }

  public Become(AST behaviour) {
    super();
    this.behaviour = behaviour;
  }

  public String toString() {
    return "Become(" + behaviour + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    behaviour.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Become());
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

  public AST subst(AST ast, String name) {
    return new Become(behaviour.subst(ast, name));
  }

}
