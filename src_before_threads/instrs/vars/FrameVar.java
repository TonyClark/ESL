package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class FrameVar extends Instr {

  {
    code = FRAMEVAR;
  }

  public int index;

  public FrameVar(int line, int index) {
    super(line);
    this.index = index;
  }

  public String toString() {
    return pprint("FRAMEVAR", index);
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getFrameVar(index));
  }

}
