package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class If extends Instr {

  int offset;

  public If(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.cond(offset);
  }

  public String toString() {
    return "If(" + offset + ")";
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

}
