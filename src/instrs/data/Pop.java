package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Pop extends Instr {

  public void perform(Actor actor) {
    actor.popStack();
  }

  public String toString() {
    return "Pop";
  }

}
