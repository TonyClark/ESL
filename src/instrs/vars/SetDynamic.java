package instrs.vars;

import actors.Actor;
import instrs.Instr;

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
