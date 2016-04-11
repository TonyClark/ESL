package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class IsBool extends Instr {

  boolean value;

  public IsBool(boolean value) {
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.pushStack((boolean)actor.popStack() == value);
  }

  public String toString() {
    return "IsBool(" + value + ")";
  }

}
