package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class False extends Instr {

  {
    code = FALSE;
  }

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
