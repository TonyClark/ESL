package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class SubLocal extends Instr {

  int index;
  int value;

  public SubLocal(int index, int value) {
    this.index = index;
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.setFrameVar(index, (int)actor.getFrameVar(index) - 1);
  }

}
