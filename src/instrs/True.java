package instrs;

import actors.Actor;

public class True extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(false);
  }

  public String toString() {
    return "False";
  }

}
