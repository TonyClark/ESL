package instrs;

import actors.Actor;
import list.Cons;

public class Head extends Instr {

  public void perform(Actor actor) {
    Cons<Object> c = (Cons) actor.popStack();
    actor.pushStack(c.getHead());
  }

}
