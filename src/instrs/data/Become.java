package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Become extends Instr {

  public Become(int line) {
    super(line);
  }

  public String toString() {
   return pprint("BECOME");
  }

  public void perform(Actor actor) {
    actors.Behaviour act = (actors.Behaviour) actor.tos();
    actor.setBehaviour(act);
  }

}
