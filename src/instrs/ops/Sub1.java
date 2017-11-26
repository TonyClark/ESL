package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Sub1 extends Instr {

  public Sub1(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object value = actor.popStack();
    if (value instanceof Integer) {
      actor.pushStack((int) value - 1);
    } else throw new Error("ADD1 expects a number: " + value);
  }

  public String toString() {
    return pprint("SUB1");
  }

}
