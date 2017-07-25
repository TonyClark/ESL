package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Gre extends Instr {

  /**************************************************************************************
   * * Machine Instruction * ------------------- * * Expectation: Two integers on the stack. * Action: Pops the values. * Result: Leaves a boolean on the stack. * *
   ************************************************************************************/

  public Gre(int line) {
    super(line);
  }

  public String toString() {
    return pprint("GRE");
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
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
      actor.pushStack(i2 > i1);
    } else if (v1 instanceof Number && v2 instanceof Number) {
      double i1;
      double i2;
      if (v1 instanceof Integer)
        i1 = new Double((int) v1).doubleValue();
      else if (v1 instanceof Long)
        i1 = new Double((long) v1).doubleValue();
      else i1 = (double) v1;

      if (v2 instanceof Integer)
        i2 = new Double((int) v2).doubleValue();
      else if (v2 instanceof Long)
        i2 = new Double((long) v2).doubleValue();
      else i2 = (double) v2;
      actor.pushStack(i2 > i1);
    } else throw new java.lang.Error("do not know how to > " + v1 + " and " + v2);
  }

}
