package instrs.ops;

import actors.Actor;
import instrs.Instr;
import list.Nil;

public class Mod extends Instr {

  public Mod(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    if (v1 instanceof Integer && v2 instanceof Integer) {
      int i1 = (int) v1;
      int i2 = (int) v2;
      actor.pushStack(i2 % i1);
    } else throw new java.lang.Error("do not know how to mod " + v1 + " and " + v2);
  }

  public String toString() {
    return pprint("MOD");
  }

}
