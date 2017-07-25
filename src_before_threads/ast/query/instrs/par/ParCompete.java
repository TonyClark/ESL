package ast.query.instrs.par;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class ParCompete extends Instr {

  public void perform(Machine machine) {
    machine.parCompete();
  }

  public String toString() {
    return "ParCompete()";
  }

}
