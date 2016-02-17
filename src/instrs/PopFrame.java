package instrs;

import actors.Actor;

public class PopFrame extends Instr {

  // Used to pop the current call frame and ignore the result...

  public String toString() {
    return "PopFrame";
  }

  public void perform(Actor actor) {
    actor.returnValue(actor);
    actor.popStack();
  }

}
