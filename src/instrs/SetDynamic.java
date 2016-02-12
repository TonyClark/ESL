package instrs;

import actors.Actor;

public class SetDynamic extends Instr {

  int index;

  public SetDynamic(int index) {
    super();
    this.index = index;
  }

  public String toString() {
    return "SetDynamic(" + index + ")";
  }

  public void perform(Actor actor) {
    actor.setDynamic(index, actor.popStack());
  }

}
