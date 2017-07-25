package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Become extends Instr {

  public Become(int line) {
    super(line);
  }

  public String toString() {
   return pprint("BECOME");
  }

  public void perform(Actor actor) {
    runtime.actors.Behaviour act = (runtime.actors.Behaviour) actor.tos();
    actor.setBehaviour(act);
  }

}
