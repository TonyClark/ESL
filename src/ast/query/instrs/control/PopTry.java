package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class PopTry extends Instr {

  public void perform(Machine machine) {
    machine.popTry();
  }

  public String toString() {
    return "PopTry()";
  }
}
