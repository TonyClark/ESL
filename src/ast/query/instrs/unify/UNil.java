package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Var;
import list.List;

public class UNil extends Instr {

  static List<Object> nil = new list.Nil<Object>();

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (value instanceof Var) {
      Var var = (Var) value;
      machine.setValue(var, nil);
    } else {
      if (!(value instanceof list.Nil<?>)) machine.fail();
    }
  }

  public String toString() {
    return "UNil()";
  }
}
