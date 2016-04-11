package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class isNil extends Instr {

  public void perform(Actor actor) {
    if (actor.popStack() instanceof list.Nil)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

  public String toString() {
    return "IsNil";
  }

}
