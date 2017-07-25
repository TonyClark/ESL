package ast.query.instrs.rel;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Greater extends Instr {

  public void perform(Machine machine) {
    Object o1 = machine.deref(machine.popCallStack());
    Object o2 = machine.deref(machine.popCallStack());
    if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      if (i2 <= i1) machine.fail();
    } else throw new Error("unknown operatnds for +: " + o1 + " " + o2);
  }

  public String toString() {
    return "Less()";
  }

}
