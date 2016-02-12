package instrs;

import actors.Actor;

public class PopDynamic extends Instr {

  public void perform(Actor actor) {
    actor.setDynamics(actor.getDynamics().getTail());
  }

  public String toString() {
    return "PopDynamic";
  }

}
