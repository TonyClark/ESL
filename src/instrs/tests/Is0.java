package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class Is0 extends Instr {

  public void perform(Actor actor) {
    actor.pushStack((int)actor.popStack() == 0);
  }

}
