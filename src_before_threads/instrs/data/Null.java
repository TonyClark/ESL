package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Null extends Instr {

  {
    code = NULL;
  }

  public Null(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(null);
  }

  public String toString() {
    return pprint("NULL");
  }

}
