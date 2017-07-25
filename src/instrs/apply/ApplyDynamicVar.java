package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.functions.Closure;

public class ApplyDynamicVar extends Instr {

  public int index;
  public int arity;

  {
    code = APPLYDYNAMICVAR;
  }

  public ApplyDynamicVar(int line, int index, int arity) {
    super(line);
    this.index = index;
    this.arity = arity;
  }

  public String toString() {
    return pprint("APPDYNAMIC", index, arity);
  }

  public void perform(Actor actor) {
    runtime.functions.Fun fun = (runtime.functions.Fun) actor.getDynamic(index);
    fun.apply(actor, arity);
  }

}
