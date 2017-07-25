package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class SetFrame extends Instr {

  {
    code = SETFRAME;
  }

  public int index;

  public SetFrame(int line, int index) {
    super(line);
    this.index = index;
  }

  public String toString() {
    return pprint("SETFRAME", index);
  }

  public void perform(Actor actor) {
    Object value = actor.tos();
    actor.setFrameVar(index, value);
  }

}
