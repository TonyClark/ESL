package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Add extends Instr {

  public Add(int line) {
    super(line);
  }

  /**************************************************************************************
   * * Machine Instruction * ------------------- * * Expectation: Two values on the stack. * Action: Pops the values. * Result: Leaves the addition of the two values on the stack. * *
   ************************************************************************************/

  public String toString() {
    return pprint("ADD");
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 == null) v1 = "null";
    if (v2 == null) v2 = "null";
    if(v1 instanceof Long) {
      Long l = (Long)v1;
      v1 = l.intValue();
    }
    if(v2 instanceof Long) {
      Long l = (Long)v2;
      v2 = l.intValue();
    }
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      actor.pushStack(i1 + i2);
    } else if (v1 instanceof Number && v2 instanceof Number) {
      double i1;
      double i2;
      if (v1 instanceof Integer)
        i1 = new Double((int) v1).doubleValue();
      else i1 = (double) v1;
      if (v2 instanceof Integer)
        i2 = new Double((int) v2).doubleValue();
      else i2 = (double) v2;
      actor.pushStack(i1 + i2);
    } else if (v1 instanceof String || v2 instanceof String) {
      actor.pushStack(v2.toString() + v1.toString());
    } else if (v1 instanceof list.List || v2 instanceof list.List) {
      list.List<Object> l1 = (list.List<Object>) v1;
      list.List<Object> l2 = (list.List<Object>) v2;
      actor.pushStack(l2.append(l1));
    } else if (v1 instanceof runtime.data.Bag && v2 instanceof runtime.data.Bag) {
      runtime.data.Bag b1 = (runtime.data.Bag) v1;
      runtime.data.Bag b2 = (runtime.data.Bag) v2;
      actor.pushStack(b1.union(b2));
    } else if (v1 instanceof runtime.data.Set && v2 instanceof runtime.data.Set) {
      runtime.data.Set b1 = (runtime.data.Set) v1;
      runtime.data.Set b2 = (runtime.data.Set) v2;
      actor.pushStack(b1.union(b2));
    } else throw new java.lang.Error("do not know how to add " + v1 + " and " + v2);
  }

}
