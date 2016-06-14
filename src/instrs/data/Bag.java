package instrs.data;

import actors.Actor;
import instrs.Instr;
import list.Nil;

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
    actors.Bag b = new actors.Bag();
    for (int i = 0; i < length; i++)
      b.add(actor.popStack());
    actor.pushStack(b);
  }

}
