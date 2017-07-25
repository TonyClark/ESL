package ast.query.instrs.locals;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class SetLocal extends Instr {

  int offset;

  public SetLocal(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    //System.out.println("SETLOCAL " + value);
    machine.setLocal(offset, value);
  }

  public String toString() {
    return "SetLocal(" + offset + ")";
  }

}
