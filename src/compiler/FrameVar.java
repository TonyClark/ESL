package compiler;

import java.util.Vector;

import ast.refs.Ref;
import instrs.Instr;
import instrs.apply.ApplyFrameVar;
import instrs.tests.FrameVarIsCons;
import instrs.tests.FrameVarIsTerm;
import instrs.vars.SetFrame;
import instrs.vars.SubLocal;

public class FrameVar extends Local {

  public FrameVar(String name, int frameIndex) {
    super(name, frameIndex);
  }

  public void compile(Vector<Instr> code) {
    code.add(new instrs.vars.FrameVar(getIndex()));
  }

  public void update(Vector<Instr> code) {
    code.add(new SetFrame(getIndex()));
  }

  public String toString() {
    return "FrameVar(" + getName() + "," + getIndex() + ")";
  }

  public void sub1(Vector<Instr> code) {
    code.add(new SubLocal(getIndex(), 1));
  }

  public void apply(int arity, Vector<Instr> code, boolean isLast) {
    code.add(new ApplyFrameVar(getIndex(), arity));
  }

  public void isCons(Vector<Instr> code) {
    code.add(new FrameVarIsCons(getIndex()));
  }

  public void isTerm(String name, int arity, Vector<Instr> code) {
    code.add(new FrameVarIsTerm(name, arity, getIndex()));
  }

  public void bind(Ref ref, Vector<Instr> code) {
    code.add(new instrs.patterns.SetFrame(ref, getIndex()));
  }

}
