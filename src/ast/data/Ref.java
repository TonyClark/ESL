package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "namespace", "name" })
public class Ref extends AST {

  public AST    namespace;
  public String name;

  public Ref() {
  }

  public Ref(AST namespace, String name) {
    super();
    this.namespace = namespace;
    this.name = name;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    namespace.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Ref(name));
  }

  public void FV(HashSet<String> vars) {
    namespace.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    namespace.DV(vars);
  }

  public int maxLocals() {
    return namespace.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Ref(namespace.subst(ast, name), this.name);
  }

  public String toString() {
    return "Ref(" + namespace + "," + name + ")";
  }

}
