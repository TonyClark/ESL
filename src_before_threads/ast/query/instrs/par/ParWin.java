package ast.query.instrs.par;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class ParWin extends Instr {

  public void perform(Machine machine) {
    machine.parWin();
  }

  public String toString() {
    return "ParWin()";
  }

}
