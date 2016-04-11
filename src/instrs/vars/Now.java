package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class Now extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(Actor.getTime());
  }

}
