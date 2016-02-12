package instrs;

import actors.Actor;

public class Pop extends Instr {

  public void perform(Actor actor) {
    actor.popStack();
  }

  public String toString() {
    return "Pop";
  }

}
