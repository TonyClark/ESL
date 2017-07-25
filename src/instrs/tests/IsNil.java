package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class IsNil extends Instr {

  {
    code = ISNIL;
  }

  public IsNil(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    if (actor.popStack() instanceof list.Nil)
      actor.pushStack(true);
    else actor.pushStack(false);
  }

  public String toString() {
    return pprint("ISNIL");
  }

}
