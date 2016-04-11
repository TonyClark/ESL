package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class Self extends Instr {

  public String toString() {
    return "Self";
  }

  public void perform(Actor actor) {
    actor.pushStack(actor);
  }

}
