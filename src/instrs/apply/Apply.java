package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class Apply extends Instr {

  /**************************************************************************************
   *                                                                                    *
   *                           Machine Instruction                                      *
   *                           -------------------                                      *
   *                                                                                    *
   *  Expectation: A function at the top of the stack above its args in reverse order.  *
   *  Action: Pops the values.                                                          *
   *  Result: Sets up a new stack frame to process the application.                     *
   *                                                                                    *
   * ************************************************************************************/

  int arity;

  public Apply(int arity) {
    this.arity = arity;
  }

  public String toString() {
    return "@(" + arity + ")";
  }

  public void perform(Actor actor) {
    actors.Fun fun = (actors.Fun) actor.popStack();
    fun.apply(actor, arity);
  }

}
