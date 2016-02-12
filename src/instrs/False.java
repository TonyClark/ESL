package instrs;

import actors.Actor;

public class False extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(false);
  }

  public String toString() {
    return "False";
  }

}
