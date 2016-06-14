package instrs.ops;

import actors.Actor;
import instrs.Instr;
import list.Cons;

public class Head extends Instr {

  public Head(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Cons<Object> c = (Cons) actor.popStack();
    actor.pushStack(c.getHead());
  }

  public String toString() {
    return pprint("HEAD");
  }

}
