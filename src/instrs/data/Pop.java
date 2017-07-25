package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Pop extends Instr {

  {
    code = POP;
  }

  public Pop(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.popStack();
  }

  public String toString() {
    return pprint("POP");
  }

}
