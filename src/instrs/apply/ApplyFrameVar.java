package instrs.apply;

import actors.Actor;
import instrs.Instr;

public class ApplyFrameVar extends Instr {

  int index;
  int arity;

  public ApplyFrameVar(int line, int index, int arity) {
    super(line);
    this.index = index;
    this.arity = arity;
  }

  public String toString() {
    return pprint("APPLYFRAME",index,arity);
  }

  public void perform(Actor actor) {
    actors.Fun fun = (actors.Fun) actor.getFrameVar(index);
    fun.apply(actor, arity);
  }

}
