package instrs;

import actors.Actor;

public class Int extends Instr {

  int value;

  public Int(int value) {
    this.value = value;
  }

  public String toString() {
    return "Int(" + value + ")";
  }

  public void perform(Actor actor) {
    actor.pushStack(value);
  }

}
