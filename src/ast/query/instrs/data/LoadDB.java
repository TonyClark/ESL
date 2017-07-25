package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;

public class LoadDB extends Instr {

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (value instanceof String) {
      machine.loadDB((String) value);
    } else machine.fail();
  }

  public String toString() {
    return "LoadDB()";
  }

}
