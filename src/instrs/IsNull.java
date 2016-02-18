package instrs;

import actors.Actor;

public class IsNull extends Instr {

  public void perform(Actor actor) {
    if (actor.popStack() == null)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

}
