package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Pop extends Instr {

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
