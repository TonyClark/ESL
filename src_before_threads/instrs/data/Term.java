package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Key;

public class Term extends Instr {

  public Key name;
  public int arity;

  {
    code = TERM;
  }

  public Term(int line, Key name, int arity) {
    super(line);
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object[] values = new Object[arity];
    for (int i = arity - 1; i >= 0; i--)
      values[i] = actor.popStack();
    actor.pushStack(new runtime.data.Term(name, values));
  }

  public String toString() {
    return pprint("TERM", name.getString(), arity);
  }

}
