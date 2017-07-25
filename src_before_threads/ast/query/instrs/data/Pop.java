package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Pop extends Instr {

  public void perform(Machine machine) {
    machine.popCallStack();
  }

  public String toString() {
    return "Pop()";
  }

}
