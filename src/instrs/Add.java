package instrs;

import actors.Actor;

public class Add extends Instr {

  public String toString() {
    return "+";
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      actor.pushStack(i1 + i2);
    } else throw new java.lang.Error("do not know how to add " + v1 + " and " + v2);
  }

}
