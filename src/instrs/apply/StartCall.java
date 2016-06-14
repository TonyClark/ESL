package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class StartCall extends Instr {

  public StartCall(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.openFrame(null, null);
  }

  public String toString() {
    return pprint("STARTCALL");
  }

}
