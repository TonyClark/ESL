package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class SetDynamic extends Instr {

  int index;

  public SetDynamic(int index) {
    super();
    this.index = index;
  }

  public String toString() {
    return "SetDynamic(" + index + ")";
  }

  public void perform(Actor actor) {
    actor.setDynamic(index, actor.tos());
  }

}
