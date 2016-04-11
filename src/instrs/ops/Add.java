package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Add extends Instr {

  /**************************************************************************************
   * * Machine Instruction * ------------------- * * Expectation: Two values on the stack. * Action: Pops the values. * Result: Leaves the addition of the two values on the stack.
   * * *
   ************************************************************************************/

  public String toString() {
    return "Add";
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      actor.pushStack(i1 + i2);
    } else if (v1 instanceof String || v2 instanceof String) {
      actor.pushStack(v2.toString() + v1.toString());
    } else if (v1 instanceof list.List || v2 instanceof list.List) {
      list.List<Object> l1 = (list.List<Object>) v1;
      list.List<Object> l2 = (list.List<Object>) v2;
      actor.pushStack(l2.append(l1));
    } else if (v1 instanceof actors.Bag && v2 instanceof actors.Bag) {
      actors.Bag b1 = (actors.Bag) v1;
      actors.Bag b2 = (actors.Bag) v2;
      actor.pushStack(b1.union(b2));
    } else throw new java.lang.Error("do not know how to add " + v1 + " and " + v2);
  }

}
