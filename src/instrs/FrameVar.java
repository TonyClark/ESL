package instrs;

import actors.Actor;

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
