package compiler;

import java.util.Vector;

import instrs.Instr;
import instrs.SetDynamic;

public class DynamicVar extends Local {

  public DynamicVar(String name, int frameIndex) {
    super(name, frameIndex);
  }

  public static DynamicVar incDynamic(DynamicVar var) {
    return new DynamicVar(var.name, var.getIndex() + 1);
  }

  public void compile(Vector<Instr> code) {
    code.add(new instrs.Dynamic(getIndex()));
  }

  public void update(Vector<Instr> code) {
    code.add(new SetDynamic(getIndex()));
  }

}
