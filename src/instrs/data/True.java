package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class True extends Instr {

  {
    code = TRUE;
  }

  public True(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(true);
  }

  public String toString() {
    return pprint("TRUE");
  }

}
