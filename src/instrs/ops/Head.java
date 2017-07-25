package instrs.ops;

import instrs.Instr;
import list.Cons;
import runtime.actors.Actor;

public class Head extends Instr {

  {
    code = HEAD;
  }

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
