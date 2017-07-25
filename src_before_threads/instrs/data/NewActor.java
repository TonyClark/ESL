package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.functions.Closure;

public class NewActor extends Instr {

  public NewActor(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    Closure closure = (Closure) actor.peek();
    closure.setSelf(new Actor());
  }

  public String toString() {
    return pprint("NEWACTOR");
  }

}
