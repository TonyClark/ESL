package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class FrameVarIsCons extends Instr {

  int index;

  public FrameVarIsCons(int line, int index) {
    super(line);
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getFrameVar(index) instanceof list.Cons);
  }

  public String toString() {
    return pprint("FRAMEVARISCONS",index);
  }

}
