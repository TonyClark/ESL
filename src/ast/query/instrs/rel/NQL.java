package ast.query.instrs.rel;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;

public class NQL extends Instr {

  public void perform(Machine machine) {
    if (machine.unify(machine.popCallStack(), machine.popCallStack())) machine.fail();
  }

  public String toString() {
    return "NQL()";
  }

}
