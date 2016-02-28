package instrs;

import actors.Actor;
import actors.Closure;

public class Try extends Instr {

  public String toString() {
    return "Try";
  }

  public void perform(Actor actor) {
    Closure body = (Closure) actor.popStack();
    Closure catcher = (Closure) actor.popStack();
    actor.openFrame(null, null);
    actor.closeFrame(body.getCode().getLocals(), body.getCode(), body.getDynamics(), catcher);
  }

}
