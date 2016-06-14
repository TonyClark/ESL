package instrs.data;

import actors.Actor;
import instrs.Instr;

public class False extends Instr {

  public False(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(false);
  }

  public String toString() {
   return pprint("FALSE");
  }

}
