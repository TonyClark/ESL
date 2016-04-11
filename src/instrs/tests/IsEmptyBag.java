package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class IsEmptyBag extends Instr {

  public void perform(Actor actor) {
    Object o = actor.popStack();
    if (o instanceof actors.Bag) {
      actors.Bag b = (actors.Bag) o;
      actor.pushStack(b.isEmpty());
    } else actor.pushStack(false);
  }

  public String toString() {
    return "IsEmptyBag";
  }

}
