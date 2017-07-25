package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class End extends Instr {

  public void perform(Machine machine) {
    if (!machine.isEnd()) machine.fail();
  }

  public String toString() {
    return "End()";
  }

}
