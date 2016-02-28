package instrs;

import actors.Actor;

public class Throw extends Instr {

  public String toString() {
    return "Throw";
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    actor.throwValue(value);
  }

}
