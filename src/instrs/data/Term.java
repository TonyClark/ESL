package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Term extends Instr {

  String name;
  int    arity;

  public Term(String name, int arity) {
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object[] values = new Object[arity];
    for (int i = arity - 1; i >= 0; i--)
      values[i] = actor.popStack();
    actor.pushStack(new actors.Term(name, values));
  }

  public String toString() {
    return "Term(" + name + "," + arity + ")";
  }

}
