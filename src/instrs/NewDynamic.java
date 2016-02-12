package instrs;

import actors.Actor;

public class NewDynamic extends Instr {

  public String toString() {
    return "NewDynamic()";
  }

  public void perform(Actor actor) {
    actor.addDynamic(actor.popStack());
  }

}
