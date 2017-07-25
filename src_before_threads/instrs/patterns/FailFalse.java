package instrs.patterns;

import instrs.Instr;
import runtime.actors.Actor;

public class FailFalse extends Instr {

  public FailFalse(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    boolean b = (boolean) actor.popStack();
    if (!b) actor.fail();
  }

  public String toString() {
    return pprint("FAILFALSE");
  }

}
