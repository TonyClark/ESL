package instrs.control;

import actors.Actor;
import instrs.Instr;

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
