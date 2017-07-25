package ast.query.instrs.par;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class ParStart extends Instr {

  public void perform(Machine machine) {
    machine.parStart();
  }

  public String toString() {
    return "ParStart()";
  }

}
