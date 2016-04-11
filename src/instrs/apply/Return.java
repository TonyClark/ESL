package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class Return extends Instr {

  public String toString() {
    return "Return";
  }

  public void perform(Actor actor) {
    actor.returnValue(actor.popStack());
  }

}
