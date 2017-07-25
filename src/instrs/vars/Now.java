package instrs.vars;

import instrs.Instr;
import runtime.ESL;
import runtime.actors.Actor;

public class Now extends Instr {

  public Now(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(ESL.getTime());
  }

  public String toString() {
   return pprint("NOW");
  }

}
