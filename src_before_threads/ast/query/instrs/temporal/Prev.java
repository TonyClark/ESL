package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Prev extends Instr {

  public void perform(Machine machine) {
    machine.prev();
  }

  public String toString() {
    return "Prev()";
  }

}
