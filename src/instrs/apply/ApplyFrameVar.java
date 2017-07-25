package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;

public class ApplyFrameVar extends Instr {

  public int index;
  public int arity;

  {
    code = APPLYFRAMEVAR;
  }

  public ApplyFrameVar(int line, int index, int arity) {
    super(line);
    this.index = index;
    this.arity = arity;
  }

  public String toString() {
    return pprint("APPLYFRAME", index, arity);
  }

  public void perform(Actor actor) {
    runtime.functions.Fun fun = (runtime.functions.Fun) actor.getFrameVar(index);
    fun.apply(actor, arity);
  }

}
