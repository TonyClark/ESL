package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class FrameVarIsCons extends Instr {

  int index;

  public FrameVarIsCons(int index) {
    super();
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getFrameVar(index) instanceof list.Cons);
  }

  public String toString() {
    return "FrameVarIsCons(" + index + ")";
  }

}
