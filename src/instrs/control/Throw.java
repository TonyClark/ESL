package instrs.control;

import actors.Actor;
import instrs.Instr;

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
