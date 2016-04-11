package compiler;

import java.util.Vector;

import ast.refs.Ref;
import instrs.Instr;
import instrs.apply.ApplyDynamicVar;
import instrs.tests.DynamicVarIsCons;
import instrs.tests.DynamicVarIsTerm;
import instrs.vars.SetDynamic;
import instrs.vars.SubDynamic;

public class DynamicVar extends Local {

  public DynamicVar(String name, int frameIndex) {
    super(name, frameIndex);
  }

  public static DynamicVar incDynamic(DynamicVar var) {
    return new DynamicVar(var.name, var.getIndex() + 1);
  }

  public void compile(Vector<Instr> code) {
    code.add(new instrs.vars.Dynamic(getIndex()));
  }

  public void update(Vector<Instr> code) {
    code.add(new SetDynamic(getIndex()));
  }

  public String toString() {
    return "DynamicVar(" + getName() + "," + getIndex() + ")";
  }

  public void sub1(Vector<Instr> code) {
    code.add(new SubDynamic(getIndex(), 1));
  }

  public void apply(int arity, Vector<Instr> code, boolean isLast) {
    code.add(new ApplyDynamicVar(getIndex(), arity));
  }

  public void isCons(Vector<Instr> code) {
    code.add(new DynamicVarIsCons(getIndex()));
  }

  public void isTerm(String name, int arity, Vector<Instr> code) {
    code.add(new DynamicVarIsTerm(name, arity, getIndex()));
  }

  public void bind(Ref ref, Vector<Instr> code) {
    code.add(new instrs.patterns.SetDynamic(ref, getIndex()));
  }

}
