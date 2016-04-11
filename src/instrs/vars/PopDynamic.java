package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class PopDynamic extends Instr {

  public void perform(Actor actor) {
    actor.setDynamics(actor.getDynamics().getTail());
  }

  public String toString() {
    return "PopDynamic";
  }

}
