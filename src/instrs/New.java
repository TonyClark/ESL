package instrs;

import actors.Actor;
import actors.Behaviour;

public class New extends Instr {

  public void perform(Actor actor) {
    Behaviour b = (Behaviour) actor.popStack();
    Object[] state = new Object[b.getArity()];
    for (int i = b.getArity() - 1; i >= 0; i--)
      state[i] = actor.popStack();
    actor.pushStack(new Actor(state, b));
  }

  public String toString() {
    return "New";
  }

}
