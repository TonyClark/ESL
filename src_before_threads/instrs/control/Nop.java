package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;

public class Nop extends Instr {

  public Nop(int line) {
    super(line);
  }

  public void perform(Actor actor) {
  }

  public String toString() {
    return pprint("NOOP");
  }

}
