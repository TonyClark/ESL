package instrs.data;

import actors.Actor;
import instrs.Instr;
import list.Nil;

public class Set extends Instr {

  int length;

  public Set(int length) {
    this.length = length;
  }

  public String toString() {
    return "Set(" + length + ")";
  }

  public void perform(Actor actor) {
    actors.Set b = new actors.Set();
    for (int i = 0; i < length; i++)
      b.add(actor.popStack());
    actor.pushStack(b);
  }

}
