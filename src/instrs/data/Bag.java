package instrs.data;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class Bag extends Instr {

  int length;

  public Bag(int line, int length) {
    super(line);
    this.length = length;
  }

  public String toString() {
   return pprint("BAG",length);
  }

  public void perform(Actor actor) {
    runtime.data.Bag b = new runtime.data.Bag();
    for (int i = 0; i < length; i++)
      b.add(actor.popStack());
    actor.pushStack(b);
  }

}
