package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class Ref extends AST {

  AST    record;
  String name;

  public Ref(AST record, String name) {
    super();
    this.record = record;
    this.name = name;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    record.compile(locals, dynamics, code);
    code.add(new instrs.Ref(name));
  }

  public void FV(HashSet<String> vars) {
    record.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    record.DV(vars);
  }

  public int maxLocals() {
    return record.maxLocals();
  }

  public AST subst(AST ast, String name) {
    System.out.println("subst " + ast + " " + name);
    return new Ref(record.subst(ast, name), this.name);
  }

  public String toString() {
    return "Ref(" + record + "," + name + ")";
  }

}
