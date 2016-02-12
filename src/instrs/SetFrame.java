package instrs;

import actors.Actor;

public class SetFrame extends Instr {

  int index;

  public SetFrame(int index) {
    super();
    this.index = index;
  }

  public String toString() {
    return "SetFrame(" + index + ")";
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    actor.setFrameVar(index, value);
  }

}
