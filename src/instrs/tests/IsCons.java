package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class IsCons extends Instr {

  public String toString() {
    return "IsCons";
  }

  public void perform(Actor actor) {
    if (actor.popStack() instanceof list.Cons)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

}
