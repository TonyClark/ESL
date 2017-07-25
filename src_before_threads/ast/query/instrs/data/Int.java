package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Int extends Instr {

  int value;

  public Int(int value) {
    super();
    this.value = value;
  }

  public void perform(Machine machine) {
    machine.pushCallStack(value);
  }

  public String toString() {
    return "Int(" + value+ ")";
  }

}
