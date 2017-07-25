package ast.query.instrs.ops;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;

public class Println extends Instr {

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.recons(value);
    System.out.println(value);
  }

  public String toString() {
    return "Println()";
  }

}
