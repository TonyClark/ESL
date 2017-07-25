package instrs.ops;

import instrs.Instr;
import list.Nil;
import runtime.actors.Actor;

public class Mod extends Instr {

  public Mod(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if(v1 instanceof Long) {
      Long l = (Long)v1;
      v1 = l.intValue();
    }
    if(v2 instanceof Long) {
      Long l = (Long)v2;
      v2 = l.intValue();
    }
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      int result = i2 % i1;
      // Deal with negative numbers ...
      if (result >= 0)
        actor.pushStack(result);
      else actor.pushStack(i1 + result);
    } else throw new java.lang.Error("do not know how to mod " + v1 + ":" + v1.getClass() + " and " + v2 + ":" + v2.getClass());
  }

  public String toString() {
    return pprint("MOD");
  }

}
