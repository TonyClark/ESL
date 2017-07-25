package compiler;

import ast.refs.Ref;
import instrs.apply.ApplyFrameVar;
import instrs.tests.FrameVarIsCons;
import instrs.tests.FrameVarIsTerm;
import instrs.vars.SetFrame;
import instrs.vars.SubLocal;
import list.List;
import runtime.functions.CodeBox;

public class FrameVar extends Local {

  public FrameVar(String name, int frameIndex) {
    super(name, frameIndex);
  }

  public void compile(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new instrs.vars.FrameVar(line, getIndex()), locals, dynamics);
  }

  public void update(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new SetFrame(line, getIndex()), locals, dynamics);
  }

  public String toString() {
    return "FrameVar(" + getName() + "," + getIndex() + ")";
  }

  public void sub1(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new SubLocal(line, getIndex(), 1), locals, dynamics);
  }

  public void apply(int arity, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics, boolean isLast) {
    code.add(new ApplyFrameVar(line, getIndex(), arity), locals, dynamics);
  }

  public void isCons(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new FrameVarIsCons(line, getIndex()), locals, dynamics);
  }

  public void isTerm(String name, int arity, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new FrameVarIsTerm(line, name, arity, getIndex()), locals, dynamics);
  }

  public void bind(Ref ref, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(new instrs.patterns.SetFrame(line, ref, getIndex()), locals, dynamics);
  }

}
