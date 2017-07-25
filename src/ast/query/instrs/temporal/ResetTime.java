package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class ResetTime extends Instr {

  int offset;

  public ResetTime(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.resetTime((int) machine.getLocal(offset));
  }

  public String toString() {
    return "Eventually(" + offset + ")";
  }

}
