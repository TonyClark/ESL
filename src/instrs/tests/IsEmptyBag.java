package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class IsEmptyBag extends Instr {

  public IsEmptyBag(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object o = actor.popStack();
    if (o instanceof runtime.data.Bag) {
      runtime.data.Bag b = (runtime.data.Bag) o;
      actor.pushStack(b.isEmpty());
    } else actor.pushStack(false);
  }

  public String toString() {
    return pprint("ISEMPTYBAG");
  }

}
