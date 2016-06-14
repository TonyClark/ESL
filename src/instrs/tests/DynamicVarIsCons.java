package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class DynamicVarIsCons extends Instr {

  int index;

  public DynamicVarIsCons(int line, int index) {
    super(line);
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushStack(actor.getDynamic(index) instanceof list.Cons);
  }

  public String toString() {
    return pprint("DYNAMICVARISCONS",index);
  }

}
