package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;

public class PopFrame extends Instr {

  // Used to pop the current call frame and ignore the result...

  {
    code = POPFRAME;
  }

  public PopFrame(int line) {
    super(line);
  }

  public String toString() {
    return pprint("POPFRAME");
  }

  public void perform(Actor actor) {
    actor.returnValue(actor);
    actor.popStack();
  }

}
