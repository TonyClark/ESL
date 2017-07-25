package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class SystemTime extends Instr {

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    long t = System.currentTimeMillis();
    if(!machine.unify(t, value))
      machine.fail();
  }

  public String toString() {
    return "SystemTime()";
  }

}
