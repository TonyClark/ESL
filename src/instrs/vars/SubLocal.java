package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class SubLocal extends Instr {

  int index;
  int value;

  public SubLocal(int line, int index, int value) {
    super(line);
    this.index = index;
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.setFrameVar(index, (int) actor.getFrameVar(index) - 1);
    actor.pushStack(actor.getFrameVar(index));
  }

  public String toString() {
   return pprint("SUBLOCAL",index);
  }

}
