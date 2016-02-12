package instrs;

import actors.Actor;

public class Null extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(null);
  }

  public String toString() {
    return "Null";
  }

}
