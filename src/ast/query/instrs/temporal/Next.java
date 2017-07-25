package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Next extends Instr {

  public void perform(Machine machine) {
    machine.next();
  }

  public String toString() {
    return "Next()";
  }

}
