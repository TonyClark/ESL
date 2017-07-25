package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;

public class Error extends Instr {

  public Error(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.printStack();
    throw new java.lang.Error(actor + ": " + actor.popStack().toString());
  }

  public String toString() {
    return pprint("ERROR");
  }
}
