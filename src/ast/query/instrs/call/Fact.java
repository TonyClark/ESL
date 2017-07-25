package ast.query.instrs.call;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.rules.Clause;

public class Fact extends Instr {

  public void perform(Machine machine) {
    machine.fact(machine.popCallStack());
  }

  public String toString() {
    return "Fact()";
  }

}
