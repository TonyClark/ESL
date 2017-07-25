package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class IsNull extends Instr {

  public IsNull(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    if (actor.popStack() == null)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

  public String toString() {
    return pprint("ISNULL");
  }

}
