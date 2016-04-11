package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Sub extends Instr {

  public String toString() {
    return "Sub";
  }

  public void perform(Actor actor) {
    Object v2 = actor.popStack();
    Object v1 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (Integer) v1;
      int i2 = (Integer) v2;
      actor.pushStack(i1 - i2);
    } else if (v1 instanceof list.List) {
      list.List<Object> l = (list.List) v1;
      actor.pushStack(l.remove(v2));
    } else throw new java.lang.Error("don't know how to subtract " + v2 + " from " + v1);

  }

}
