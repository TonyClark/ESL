package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Var;

public class ConsVar extends Instr {

  public void perform(Machine machine) {
    machine.pushCallStack(new Var());
  }

  public String toString() {
    return "ConsVar()";
  }

}
