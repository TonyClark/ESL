package ast.query.instrs.ops;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class Add extends Instr {

  public void perform(Machine machine) {
    Object o1 = machine.deref(machine.popCallStack());
    Object o2 = machine.deref(machine.popCallStack());
    if (o1 instanceof List<?> && o2 instanceof List<?>) {
      List<Object> l1 = (List<Object>) machine.recons(o1);
      List<Object> l2 = (List<Object>) machine.recons(o2);
      machine.pushCallStack(l1.append(l2));
    } else if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      machine.pushCallStack(i1 + i2);
    } else if (o1 instanceof String || o2 instanceof String) {
      String s1 = machine.recons(o1) + "";
      String s2 = machine.recons(o2) + "";
      machine.pushCallStack(s2 + s1);
    } else if (o1 instanceof Long || o2 instanceof Long) {
      Number i1 = (Number) o1;
      Number i2 = (Number) o2;
      machine.pushCallStack(i1.longValue() + i2.longValue());
    } else throw new Error("unknown operands for +: " + o1 + ":" + o1.getClass() + " " + o2 + ":" + o2.getClass());
  }

  public String toString() {
    return "Add()";
  }

}
