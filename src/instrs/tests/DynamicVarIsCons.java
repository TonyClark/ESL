package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class DynamicVarIsCons extends Instr {

  int index;

  public DynamicVarIsCons(int index) {
    super();
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getDynamic(index) instanceof list.Cons);
  }

  public String toString() {
    return "DynamicVarIsCons(" + index + ")";
  }

}
