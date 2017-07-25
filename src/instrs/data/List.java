package instrs.data;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class List extends Instr {

  int length;

  public List(int line, int length) {
    super(line);
    this.length = length;
  }

  public String toString() {
   return pprint("LIST",length);
  }

  public void perform(Actor actor) {
    list.List<Object> l = new Nil<Object>();
    for (int i = 0; i < length; i++)
      l = l.cons(actor.popStack());
    actor.pushStack(l);
  }

}
