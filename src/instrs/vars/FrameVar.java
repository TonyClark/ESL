package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class FrameVar extends Instr {

  int index;

  public FrameVar(int index) {
    this.index = index;
  }

  public String toString() {
    return "FrameVar(" + index + ")";
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getFrameVar(index));
  }

}
