package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Add1 extends Instr {

  public Add1(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    if (value instanceof Integer) {
      actor.pushStack((int) value + 1);
    } else actor.pushStack(value + "" + 1);
  }

  public String toString() {
    return pprint("ADD1");
  }

}
