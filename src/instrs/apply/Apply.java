package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;

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

  public int arity;
  
  { code = APPLY; }

  public Apply(int line,int arity) {
    super(line);
    this.arity = arity;
  }

  public String toString() {
    return pprint("APPLY",arity);
  }

  public void perform(Actor actor) {
    runtime.functions.Fun fun = (runtime.functions.Fun) actor.popStack();
    fun.apply(actor, arity);
  }

}
