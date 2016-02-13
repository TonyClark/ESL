package compiler;

import java.util.Vector;

import instrs.Instr;
import instrs.SetFrame;

public class FrameVar extends Local {

  public FrameVar(String name, int frameIndex) {
    super(name, frameIndex);
  }

  public void compile(Vector<Instr> code) {
    code.add(new instrs.FrameVar(getIndex()));
  }

  public void update(Vector<Instr> code) {
    code.add(new SetFrame(getIndex()));
  }
  
  public String toString() {
    return "DynamicVar(" + getName() + "," + getIndex() + ")";
  }

}
