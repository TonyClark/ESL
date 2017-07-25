package instrs.ops;

import instrs.Instr;
import list.Cons;
import runtime.actors.Actor;

public class Tail extends Instr {

  {
    code = TAIL;
  }

  public Tail(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Cons<Object> c = (Cons) actor.popStack();
    actor.pushStack(c.getTail());
  }

  public String toString() {
    return pprint("TAIL");
  }

}
