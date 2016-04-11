package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class ApplyDynamicVar extends Instr {

  int index;
  int arity;

  public ApplyDynamicVar(int index, int arity) {
    this.index = index;
    this.arity = arity;
  }

  public String toString() {
    return "@DynamicVar(" + index + "," + arity + ")";
  }

  public void perform(Actor actor) {
    actors.Fun fun = (actors.Fun) actor.getDynamic(index);
    fun.apply(actor, arity);
  }

}
