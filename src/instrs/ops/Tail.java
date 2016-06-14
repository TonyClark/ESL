package instrs.ops;

import actors.Actor;
import instrs.Instr;
import list.Cons;

public class Tail extends Instr {

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
