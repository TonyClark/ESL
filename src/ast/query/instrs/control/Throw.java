package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Throw extends Instr {

  public void perform(Machine machine) {
    machine.throwValue(machine.popCallStack());
  }

  public String toString() {
    return "Throw()";
  }

}
