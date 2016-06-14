package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Cons extends Instr {

  public Cons(int line) {
    super(line);
  }

  public String toString() {
    return pprint("CONS");
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof list.List) {
      list.List<Object> l = (list.List) v1;
      actor.pushStack(((list.List) v1).cons(v2));
    } else throw new java.lang.Error("expecting a list for cons:" + v1);
  }

}
