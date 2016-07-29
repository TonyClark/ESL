package instrs.vars;

import actors.Actor;
import instrs.Instr;

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
