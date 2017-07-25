package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Var;

public class IsVar extends Instr {

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (!(value instanceof Var)) machine.fail();
  }

  public String toString() {
    return "IsVar()";
  }

}
