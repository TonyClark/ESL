package instrs.patterns;

import actors.Actor;
import instrs.Instr;

public class FailFalse extends Instr {

  public void perform(Actor actor) {
    boolean b = (boolean) actor.popStack();
    if (!b) actor.fail();
  }

  public String toString() {
    return "FailFalse";
  }

}
