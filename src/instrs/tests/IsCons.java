package instrs.tests;

import actors.Actor;
import instrs.Instr;

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
