package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class SetDynamic extends Instr {

  int index;

  public SetDynamic(int line, int index) {
    super(line);
    this.index = index;
  }

  public String toString() {
   return pprint("SETDYNAMIC",index);
  }

  public void perform(Actor actor) {
    actor.setDynamic(index, actor.tos());
  }

}
