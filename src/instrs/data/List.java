package instrs.data;

import actors.Actor;
import instrs.Instr;
import list.Nil;

public class List extends Instr {

  int length;

  public List(int length) {
    this.length = length;
  }

  public String toString() {
    return "List(" + length + ")";
  }

  public void perform(Actor actor) {
    list.List<Object> l = new Nil<Object>();
    for (int i = 0; i < length; i++)
      l = l.cons(actor.popStack());
    actor.pushStack(l);
  }

}
