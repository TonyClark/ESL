package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Add1 extends Instr {

  public void perform(Actor actor) {
    actor.pushStack((int)actor.popStack()+1);
  }

  public String toString() {
    return "Add1";
  }

}
