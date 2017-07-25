package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class TermRef extends Instr {

  int index;

  public TermRef(int line, int index) {
    super(line);
    this.index = index;
  }

  public void perform(Actor actor) {
    runtime.data.Term t = (runtime.data.Term) actor.popStack();
    actor.pushStack(t.getValues()[index]);
  }

  public String toString() {
    return pprint("TERMREF",index);
  }
}
