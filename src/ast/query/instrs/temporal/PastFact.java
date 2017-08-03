package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class PastFact extends Instr {

  public PastFact() {
    super();
  }

  public void perform(Machine machine) {
    machine.pastFact(machine.popCallStack());
  }

  public String toString() {
    return "PastFact()";
  }

}
