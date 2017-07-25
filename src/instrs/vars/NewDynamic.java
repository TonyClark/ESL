package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class NewDynamic extends Instr {

  public NewDynamic(int line) {
    super(line);
  }

  public String toString() {
   return pprint("NEWDYNAMIC");
  }

  public void perform(Actor actor) {
    actor.addDynamic(actor.popStack());
  }

}
