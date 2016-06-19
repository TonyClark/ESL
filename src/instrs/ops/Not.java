package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Not extends Instr {

  public Not(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    boolean b = (boolean)actor.popStack();
    actor.pushStack(!b);
  }

  public String toString() {
    return pprint("NOT");
  }

}