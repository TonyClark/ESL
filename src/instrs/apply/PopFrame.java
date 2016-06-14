package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class PopFrame extends Instr {

  // Used to pop the current call frame and ignore the result...

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
