package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;

public class Unify extends Instr {

  public void perform(Machine machine) {
    if (!machine.unify(machine.popCallStack(), machine.popCallStack())) machine.fail();
  }

  public String toString() {
    return "Unify()";
  }

}
