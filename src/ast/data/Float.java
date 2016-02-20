package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "n", "m" })
public class Float extends AST {

  public int n;
  public int m;

  public Float() {
  }

  public String toString() {
    return "Float(" + n + "." + m + ")";
  }

  @Override
  public void compile(List<FrameVar> locals, List<DynamicVar> types, Vector<Instr> code) {
    // TODO Auto-generated method stub

  }

  public void FV(HashSet<String> vars) {
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

  public AST subst(AST ast, String name) {
    return this;
  }

}
