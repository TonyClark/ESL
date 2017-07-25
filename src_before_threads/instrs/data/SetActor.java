package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class SetActor extends Instr {

  public SetActor(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    runtime.actors.Behaviour b = (runtime.actors.Behaviour) actor.popStack();
    b.getSelf().initBehaviour(b);
    actor.pushStack(b.getSelf());
  }

  public String toString() {
    return pprint("SETACTOR");
  }

}
