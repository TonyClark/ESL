package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class PopDynamic extends Instr {

  public PopDynamic(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.setDynamics(actor.getDynamics().getTail());
  }

  public String toString() {
   return pprint("POPDYNAMIC");
  }

}
