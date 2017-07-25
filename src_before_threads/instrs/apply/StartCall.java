package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;

public class StartCall extends Instr {

  {
    code = STARTCALL;
  }

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
