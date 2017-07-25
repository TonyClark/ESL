package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;

public class Throw extends Instr {

  public Throw(int line) {
    super(line);
  }

  public String toString() {
    return pprint("THROW");
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    actor.throwValue(value);
  }

}
