package instrs.data;

import actors.Actor;
import actors.JavaActor;
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

    Object o = actor.popStack();
    if (o instanceof Actor)
      sendActor(actor, (Actor) o);
    else if (o instanceof JavaActor)
      sendJavaActor(actor, (JavaActor) o);
    else throw new Error("unknown target for message " + o);
  }

  private void sendJavaActor(Actor actor, JavaActor target) {
    int time = (int) actor.popStack();
    Object message = actor.popStack();
    target.send(message, time);
    actor.pushStack(target);
  }

  public void sendActor(Actor actor, Actor target) {
    int time = (int) actor.popStack();
    Object message = actor.popStack();
    target.send(message, time);
    actor.pushStack(target);
  }

}
