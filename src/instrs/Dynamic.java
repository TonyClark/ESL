package instrs;

import actors.Actor;

public class Dynamic extends Instr {

  int index;

  public Dynamic(int index) {
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getDynamic(index));
  }

  public String toString() {
    return "Dynamic(" + index + ")";
  }

}
