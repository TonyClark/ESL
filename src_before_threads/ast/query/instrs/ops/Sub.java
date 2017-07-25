package ast.query.instrs.ops;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Sub extends Instr {

  public void perform(Machine machine) {
    Object o1 = machine.deref(machine.popCallStack());
    Object o2 = machine.deref(machine.popCallStack());
    if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      machine.pushCallStack(i2 - i1);
    } else if (o1 instanceof Long || o2 instanceof Long) {
      long l1 = (long) o1;
      long l2 = (long) o2;
      machine.pushCallStack(l2 - l1);
    } else throw new Error("unknown operands for -: " + o1 + ":" + o1.getClass() + " " + o2 + ":" + o2.getClass());
  }

  public String toString() {
    return "Sub()";
  }

}
