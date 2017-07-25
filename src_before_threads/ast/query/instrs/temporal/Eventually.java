package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Eventually extends Instr {

  int offset;

  public Eventually(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.eventually(offset);
  }

  public String toString() {
    return "Eventually(" + offset + ")";
  }

}
