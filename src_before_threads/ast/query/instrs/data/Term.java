package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;
import runtime.data.Key;

public class Term extends Instr {

  Key key;
  int arity;

  public Term(Key key, int arity) {
    super();
    this.key = key;
    this.arity = arity;
  }

  public void perform(Machine machine) {
    runtime.data.Term term = new runtime.data.Term(key);
    term.setValues(new Object[arity]);
    for (int i = arity - 1; i >= 0; i--)
      term.getValues()[i] = machine.popCallStack();
    machine.pushCallStack(term);
  }

  public String toString() {
    return "Term(" + key.getString() + "," + arity + ")";
  }
}
