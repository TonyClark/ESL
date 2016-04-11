package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class TermRef extends Instr {

  int index;

  public TermRef(int index) {
    super();
    this.index = index;
  }

  public void perform(Actor actor) {
    actors.Term t = (actors.Term) actor.popStack();
    actor.pushStack(t.getValues()[index]);
  }

  public String toString() {
    return "TermRef(" + index + ")";
  }
}
