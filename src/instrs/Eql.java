package instrs;

import actors.Actor;

public class Eql extends Instr {

  public void perform(Actor actor) {
    Object v1 = actor.popStack();
    Object v2 = actor.popStack();
    //System.out.println(v1 + "=" + v2);
    if (v1.equals(v2))
      actor.pushStack(true);
    else actor.pushStack(false);
  }

  public String toString() {
    return "=";
  }

}
