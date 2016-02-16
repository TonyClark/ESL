package instrs;

import actors.Actor;

public class Error extends Instr {

  public void perform(Actor actor) {
    throw new java.lang.Error(actor + ": " + actor.popStack().toString());
  }

}
