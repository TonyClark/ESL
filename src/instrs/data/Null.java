package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Null extends Instr {

  public void perform(Actor actor) {
    actor.pushStack(null);
  }

  public String toString() {
    return "Null";
  }

}
