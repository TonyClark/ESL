package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;

public class Str extends Instr {

  String value;

  public Str(String value) {
    super();
    this.value = value;
  }

  public void perform(Machine machine) {
    machine.pushCallStack(value);
  }

  public String toString() {
    return "STR(" + value + ")";
  }

}
