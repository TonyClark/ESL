package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Sub extends Instr {

  public Sub(int line) {
    super(line);
  }

  public String toString() {
    return pprint("SUB");
  }

  public void perform(Actor actor) {
    Object v2 = actor.popStack();
    Object v1 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (Integer) v1;
      int i2 = (Integer) v2;
      actor.pushStack(i1 - i2);
    } else if (v1 instanceof Number && v2 instanceof Number) {
      
      double i1;
      double i2;
      
      if (v1 instanceof Integer)
        i1 = new Double((int) v1).doubleValue();
      else i1 = (double) v1;

      if (v2 instanceof Integer)
        i2 = new Double((int) v2).doubleValue();
      else i2 = (double) v2;
      actor.pushStack(i1 - i2);
    } else if (v1 instanceof list.List) {
      list.List<Object> l = (list.List) v1;
      actor.pushStack(l.remove(v2));
    } else throw new java.lang.Error("don't know how to subtract " + v2 + " from " + v1);

  }

}
