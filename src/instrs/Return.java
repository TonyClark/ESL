package instrs;

import actors.Actor;

public class Return extends Instr {

  public String toString() {
    return "Return";
  }

  public void perform(Actor actor) {
    actor.returnValue(actor.popStack());
  }

}
