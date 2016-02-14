package instrs;

import actors.Actor;

public class Sub extends Instr {

  public String toString() {
    return "-";
  }

  public void perform(Actor actor) {
    Object v2 = actor.popStack();
    Object v1 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (Integer) v1;
      int i2 = (Integer) v2;
      actor.pushStack(i1 - i2);
    } else throw new Error("don't know how to subtract " + v2 + " from " + v1);
  }

}
