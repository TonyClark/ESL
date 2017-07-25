package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class Is0 extends Instr {

  public Is0(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack((int) actor.popStack() == 0);
  }

  public String toString() {
    return pprint("IS0");
  }
}
