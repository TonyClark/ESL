package instrs;

import actors.Actor;
import list.Cons;

public class Tail extends Instr {

  public void perform(Actor actor) {
    Cons<Object> c = (Cons) actor.popStack();
    actor.pushStack(c.getTail());
  }

}
