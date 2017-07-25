package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;
import ast.query.value.Var;

public class UStr extends Instr {

  String value;

  public UStr(String value) {
    super();
    this.value = value;
  }

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (value instanceof Var) {
      Var var = (Var) value;
      machine.setValue(var, this.value);
    } else {
      if (value instanceof String) {
        String i = (String) value;
        if (!i.equals(this.value)) machine.fail();
      } else machine.fail();
    }
  }

}
