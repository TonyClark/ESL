package instrs.patterns;

import instrs.Instr;
import runtime.actors.Actor;

public class Fail extends Instr {

  public Fail(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.fail();
  }

  public String toString() {
    return pprint("FAIL");
  }

}
