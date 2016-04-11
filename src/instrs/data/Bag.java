package instrs.data;

import actors.Actor;
import instrs.Instr;
import list.Nil;

public class Bag extends Instr {

  int length;

  public Bag(int length) {
    this.length = length;
  }

  public String toString() {
    return "Bag(" + length + ")";
  }

  public void perform(Actor actor) {
    actors.Bag b = new actors.Bag();
    for(int i = 0; i < length; i ++)
      b.add(actor.popStack());
    actor.pushStack(b);
  }

}
