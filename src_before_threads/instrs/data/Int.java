package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Int extends Instr {

  public int value;

  {
    code = INT;
  }

  public Int(int line, int value) {
    super(line);
    this.value = value;
  }

  public String toString() {
    return pprint("INT", value);
  }

  public void perform(Actor actor) {
    actor.pushStack(value);
  }

}
