package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Send extends Instr {

  int arity;

  public Send(int arity) {
    this.arity = arity;
  }

  public String toString() {
    return "Send(" + arity + ")";
  }

  public void perform(Actor actor) {
    // For now assume that all messages are single values...
    Actor target = (Actor) actor.popStack();
    int time = (int) actor.popStack();
    Object message = actor.popStack();
    target.send(message, time);
    actor.pushStack(target);
  }

}
