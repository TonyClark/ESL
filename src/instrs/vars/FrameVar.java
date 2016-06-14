package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class FrameVar extends Instr {

  int index;

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
