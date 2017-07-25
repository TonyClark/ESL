package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Fail extends Instr {

  public void perform(Machine machine) {
    machine.fail();
  }
  
  public String toString() {
    return "Fail()";
  }

}
