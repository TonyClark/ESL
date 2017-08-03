package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class PastFact1 extends Instr {

  public PastFact1() {
    super();
  }

  public void perform(Machine machine) {
    machine.pastFact1(machine.popCallStack());
  }

  public String toString() {
    return "PastFact1()";
  }

}
