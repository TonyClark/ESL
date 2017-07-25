package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.actors.JavaActor;

public class Send extends Instr {

  public Send(int line) {
    super(line);
  }

  public String toString() {
    return pprint("SEND");
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
    Object message = actor.popStack();
    target.send(message, 0);
    actor.pushStack(target);
  }

  public void sendActor(Actor actor, Actor target) {
    throw new Error("SEND instruction is deprecated.");
  }

}
