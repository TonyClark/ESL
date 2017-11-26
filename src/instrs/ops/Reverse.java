package instrs.ops;

import instrs.Instr;
import runtime.actors.Actor;

public class Reverse extends Instr {

  public Reverse(int line) {
    super(line);
  }

  public String toString() {
    return pprint("REVERSE");
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    if (v1 instanceof list.List) {
      list.List<Object> l = (list.List) v1;
      actor.pushStack(l.reverse());
    } else throw new java.lang.Error("expecting a list for reverse:" + v1);
  }

}
