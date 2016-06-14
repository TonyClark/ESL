package instrs.data;

import actors.Actor;
import instrs.Instr;

public class True extends Instr {

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
