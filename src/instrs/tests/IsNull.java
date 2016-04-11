package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class IsNull extends Instr {

  public void perform(Actor actor) {
    if (actor.popStack() == null)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

}
