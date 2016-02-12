package instrs;

import actors.Actor;

public class Send extends Instr {

  int arity;

  public Send(int arity) {
    this.arity = arity;
  }

  public String toString() {
    return "Send(" + arity + ")";
  }

  public void perform(Actor actor) {
    Actor target = (Actor) actor.popStack();
  }

}
