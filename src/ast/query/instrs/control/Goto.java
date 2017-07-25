package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Goto extends Instr {

  int offset;

  public Goto(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.go(offset);
  }

  public String toString() {
    return "Goto(" + offset + ")";
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

}
