package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class Self extends Instr {

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
