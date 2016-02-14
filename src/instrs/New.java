package instrs;

import actors.Actor;
import actors.Behaviour;

public class New extends Instr {

  public void perform(Actor actor) {
    Behaviour b = (Behaviour) actor.popStack();
    actor.pushStack(new Actor(b));
  }

  public String toString() {
    return "New";
  }

}
