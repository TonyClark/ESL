package ast.query.instrs.ops;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Mul extends Instr {

  public void perform(Machine machine) {
    Object o1 = machine.deref(machine.popCallStack());
    Object o2 = machine.deref(machine.popCallStack());
    if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      machine.pushCallStack(i1 * i2);
    } else throw new Error("unknown operands for *: " + o1 + " " + o2);
  }

  public String toString() {
    return "Mul()";
  }

}
