package instrs.data;

import actors.Actor;
import instrs.Instr;

public class False extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(false);
  }

  public String toString() {
    return "False";
  }

}
