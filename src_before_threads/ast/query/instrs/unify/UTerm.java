package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Value;
import ast.query.value.Var;
import runtime.data.Key;

public class UTerm extends Instr {

  Key key;
  int arity;

  public UTerm(Key key, int arity) {
    super();
    this.key = key;
    this.arity = arity;
  }

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (value instanceof Var) {
      Var var = (Var) value;
      Var[] vars = new Var[arity];
      for (int i = 0; i < arity; i++)
        vars[i] = new Var();
      runtime.data.Term term = new runtime.data.Term(key);
      term.setValues(vars);
      machine.setValue(var, term);
      for (int i = arity - 1; i >= 0; i--)
        machine.pushCallStack(vars[i]);
    } else if (value instanceof runtime.data.Term) {
      runtime.data.Term t = (runtime.data.Term) value;
      if (t.getName() == key && t.getArity() == arity) {
        for (int i = arity - 1; i >= 0; i--) {
          machine.pushCallStack(t.getValues()[i]);
        }
      } else machine.fail();
    } else machine.fail();
  }

  public String toString() {
    return "UTerm(" + key + "," + arity + ")";
  }
}
