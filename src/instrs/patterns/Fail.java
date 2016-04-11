package instrs.patterns;

import actors.Actor;
import instrs.Instr;

public class Fail extends Instr {

  public void perform(Actor actor) {
    actor.fail();
  }

  public String toString() {
    return "Fail";
  }

}
