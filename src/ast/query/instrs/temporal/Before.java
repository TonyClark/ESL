package ast.query.instrs.temporal;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;
import runtime.data.Term;

public class Before extends Instr {

  public Before() {
    super();
  }

  public void perform(Machine machine) {
    Term fact = (Term) machine.deref(machine.popCallStack());
    List<Term> facts = (List<Term>) machine.deref(machine.popCallStack());
    machine.before(fact, facts);
  }

  public String toString() {
    return "Before()";
  }

}
