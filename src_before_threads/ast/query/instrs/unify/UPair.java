package ast.query.instrs.unify;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Var;
import list.Cons;
import list.Maybe;

public class UPair extends Instr {

  public void perform(Machine machine) {
    Object value = machine.popCallStack();
    value = machine.deref(value);
    if (value instanceof Var) {
      Var var = (Var) value;
      Maybe<Object> maybe = new Maybe<Object>(new Var());
      Cons<Object> pair = new Cons<Object>(new Var(), maybe);
      machine.setValue(var, pair);
      machine.pushCallStack(pair.getTailMaybe());
      machine.pushCallStack(pair.getHead());
    } else if (value instanceof Cons<?>) {
      Cons<Object> p = (Cons<Object>) value;
      machine.pushCallStack(p.getTailMaybe());
      machine.pushCallStack(p.getHead());
    } else machine.fail();
  }

  public String toString() {
    return "UPair()";
  }

}
