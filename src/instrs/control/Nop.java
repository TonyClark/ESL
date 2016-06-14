package instrs.control;

import actors.Actor;
import instrs.Instr;

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
