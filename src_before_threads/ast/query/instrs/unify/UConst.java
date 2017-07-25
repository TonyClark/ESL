package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class UConst extends Instr {

  Object value;

  public UConst(Object value) {
    super();
    this.value = value;
  }

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    if (!machine.unify(value, this.value)) machine.fail();
  }

  public String toString() {
    return "UConst(" + value + ")";
  }
}
