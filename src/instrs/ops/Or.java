package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Or extends Instr {

  /**************************************************************************************
   *                                                                                    *
   *                           Machine Instruction                                      *
   *                           -------------------                                      *
   *                                                                                    *
   *  Expectation: Two values on the stack.                                             *
   *  Action: Pops the values.                                                          *
   *  Result: Leaves the disjunction of the two values on the stack.                    *
   *                                                                                    *
   * ************************************************************************************/

  public String toString() {
    return "AND";
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Boolean && v2 instanceof Boolean) {
      boolean i1 = (boolean) v1;
      boolean i2 = (boolean) v2;
      actor.pushStack(i1 || i2);
    }else throw new java.lang.Error("do not know how to or " + v1 + " and " + v2);
  }

}
