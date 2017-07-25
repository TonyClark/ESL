package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;

public class Return extends Instr {

  {
    code = RETURN;
  }

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
