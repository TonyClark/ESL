package instrs.ops;

import actors.Actor;
import instrs.Instr;

public class Add1 extends Instr {

  public Add1(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack((int)actor.popStack()+1);
  }

  public String toString() {
    return pprint("ADD1");
  }

}
