package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.data.False;
import instrs.data.True;
import list.List;

@BoaConstructor(fields = { "value" })
public class Bool extends AST {

  public static final AST TRUE = new Bool(true);
  public static final AST FALSE = new Bool(false);
  
  public boolean value;

  public Bool() {
  }

  public Bool(boolean value) {
    this.value = value;
  }

  public String toString() {
    return "Bool(" + value + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    if (value)
      code.add(new True());
    else code.add(new False());
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
