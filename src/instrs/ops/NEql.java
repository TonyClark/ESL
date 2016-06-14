package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class NEql extends Instr {

  public NEql(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 == null)
      actor.pushStack(v2 != null);
    else if (v2 == null)
      actor.pushStack(v1 != null);
    else if (v1.equals(v2))
      actor.pushStack(false);
    else actor.pushStack(true);
  }

  public String toString() {
    return pprint("NEQL");
  }

}
