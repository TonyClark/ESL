package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Cut extends Instr {

  public void perform(Machine machine) {
    machine.cut();
  }

  public String toString() {
    return "Cut()";
  }
}
