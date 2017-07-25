package instrs.ops;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class To extends Instr {

  public To(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      list.List<Integer> l = new Nil<Integer>();
      for (int i = i1; i >= i2; i--)
        l = l.cons(i);
      actor.pushStack(l);
    } else throw new java.lang.Error("do not know how to add " + v1 + " and " + v2);
  }

  public String toString() {
    return pprint("TO");
  }

}
