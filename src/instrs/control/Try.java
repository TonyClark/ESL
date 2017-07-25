package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.functions.Closure;

public class Try extends Instr {

  public Try(int line) {
    super(line);
  }

  public String toString() {
    return pprint("TRY");
  }

  public void perform(Actor actor) {
    Closure body = (Closure) actor.popStack();
    Closure catcher = (Closure) actor.popStack();
    actor.openFrame(null, null);
    actor.closeFrame(body.getCode().getLocals(), body.getCode(), body.getDynamics(), catcher);
  }

}
