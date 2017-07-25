package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class Dynamic extends Instr {

  {
    code = DYNAMIC;
  }

  public int index;

  public Dynamic(int line, int index) {
    super(line);
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getDynamic(index));
  }

  public String toString() {
    return pprint("DYNAMIC", index);
  }

}
