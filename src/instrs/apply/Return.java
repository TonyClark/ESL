package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class Return extends Instr {

  public Return(int line) {
    super(line);
  }

  public String toString() {
    return pprint("RETURN");
  }

  public void perform(Actor actor) {
    actor.returnValue(actor.popStack());
  }

}
