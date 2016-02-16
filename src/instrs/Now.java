package instrs;

import actors.Actor;

public class Now extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(Actor.getTime());
  }

}
