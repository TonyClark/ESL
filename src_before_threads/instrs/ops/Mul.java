package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Mul extends Instr {

  public Mul(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      actor.pushStack(i1 * i2);
    } else if (v1 instanceof Number && v2 instanceof Number) {
      double i1;
      double i2;
      if (v1 instanceof Integer)
        i1 = new Double((int) v1).doubleValue();
      else i1 = (double) v1;

      if (v2 instanceof Integer)
        i2 = new Double((int) v2).doubleValue();
      else i2 = (double) v2;
      actor.pushStack(i1 * i2);
    } else if (v1 instanceof list.List || v2 instanceof list.List) {
      list.List<Object> l1 = (list.List<Object>) v1;
      list.List<Object> l2 = (list.List<Object>) v2;
      actor.pushStack(l2.product(l1));
    } else throw new java.lang.Error("do not know how to multiply " + v1 + " and " + v2);
  }

  public String toString() {
    return pprint("MUL");
  }

}
