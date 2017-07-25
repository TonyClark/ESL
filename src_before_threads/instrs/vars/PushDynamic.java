package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;

public class PushDynamic extends Instr {

  int index;

  public PushDynamic(int line, int index) {
    super(line);
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.pushDynamic(index);
  }

}
