package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Int extends Instr {

  int value;

  public Int(int line, int value) {
    super(line);
    this.value = value;
  }

  public String toString() {
   return pprint("INT",value);
  }

  public void perform(Actor actor) {
    actor.pushStack(value);
  }

}
