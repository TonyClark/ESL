package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class Self extends Instr {

  {
    code = SELF;
  }

  public Self(int line) {
    super(line);
  }

  public String toString() {
    return pprint("SELF");
  }

  public void perform(Actor actor) {
    actor.pushStack(actor);
  }

}
