package instrs;

import actors.Actor;

public class Str extends Instr {

  String value;

  public Str(String value) {
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.pushStack(value);
  }

  public String toString() {
    return "Str(" + value + ")";
  }

}
