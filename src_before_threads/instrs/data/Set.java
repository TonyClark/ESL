package instrs.data;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class Set extends Instr {

  int length;

  public Set(int line, int length) {
    super(line);
    this.length = length;
  }

  public String toString() {
   return pprint("SET",length);
  }


  public void perform(Actor actor) {
    runtime.data.Set b = new runtime.data.Set();
    for (int i = 0; i < length; i++)
      b.add(actor.popStack());
    actor.pushStack(b);
  }

}
