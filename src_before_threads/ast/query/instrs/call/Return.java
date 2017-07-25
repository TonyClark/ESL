package ast.query.instrs.call;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.rules.Clause;

public class Return extends Instr {

  public void perform(Machine machine) {
    Clause clause = machine.getCallClause();
    if (clause.isSpied()) {
      machine.spaces(machine.getIndent());
      System.out.println("RETURN " + machine.ppCall());
    }
    machine.returnFrame();
  }

  public String toString() {
    return "Return()";
  }

}
