package instrs.vars;

import actors.Actor;
import instrs.Instr;

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
