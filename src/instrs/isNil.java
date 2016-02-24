package instrs;

import actors.Actor;

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
