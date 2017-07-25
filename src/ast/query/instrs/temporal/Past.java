package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Past extends Instr {

  int offset;

  public Past(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.past(offset);
  }

  public String toString() {
    return "Past(" + offset + ")";
  }

}
