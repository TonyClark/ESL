package instrs;

import actors.Actor;

public class StartCall extends Instr {

  public void perform(Actor actor) {
    actor.openFrame(null, null);
  }

  public String toString() {
    return "StartCall";
  }

}
