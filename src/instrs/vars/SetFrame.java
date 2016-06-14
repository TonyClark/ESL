package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class SetFrame extends Instr {

  int index;

  public SetFrame(int line, int index) {
    super(line);
    this.index = index;
  }

  public String toString() {
   return pprint("SETFRAME",index);
  }

  public void perform(Actor actor) {
    Object value = actor.tos();
    actor.setFrameVar(index, value);
  }

}
