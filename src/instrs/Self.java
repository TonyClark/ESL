package instrs;

import actors.Actor;

public class Self extends Instr {

  public String toString() {
    return "Self";
  }

  public void perform(Actor actor) {
    actor.pushStack(actor);
  }

}
