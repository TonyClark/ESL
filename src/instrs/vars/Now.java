package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class Now extends Instr {

  public Now(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(Actor.getTime());
  }

  public String toString() {
   return pprint("NOW");
  }

}
