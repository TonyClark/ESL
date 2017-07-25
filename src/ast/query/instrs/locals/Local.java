package ast.query.instrs.locals;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Local extends Instr {

  int offset;

  public Local(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    //System.out.println("LOCAL " + machine.getLocal(offset));
    machine.pushCallStack(machine.getLocal(offset));
  }

  public String toString() {
    return "Local(" + offset + ")";
  }

}
