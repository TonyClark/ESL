package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class IsCons extends Instr {

  public IsCons(int line) {
    super(line);
  }

  public String toString() {
    return pprint("ISCONS");
  }

  public void perform(Actor actor) {
    if (actor.popStack() instanceof list.Cons)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

}
