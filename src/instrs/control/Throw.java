package instrs.control;

import actors.Actor;
import instrs.Instr;

public class Throw extends Instr {

  public String toString() {
    return "Throw";
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    actor.throwValue(value);
  }

}
