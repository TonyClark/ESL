package instrs.data;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class List extends Instr {

  private final static list.List<Object> NIL = new Nil<Object>();

  int                                    length;

  public List(int line, int length) {
    super(line);
    this.length = length;
  }

  public String toString() {
    return pprint("LIST", length);
  }

  public void perform(Actor actor) {
    if (length == 0)
      actor.pushStack(NIL);
    else {
      list.List<Object> l = new Nil<Object>();
      for (int i = 0; i < length; i++)
        l = l.cons(actor.popStack());
      actor.pushStack(l);
    }
  }

}
