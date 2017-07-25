package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Str extends Instr {

  String value;

  public Str(int line, String value) {
    super(line);
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.pushStack(value);
  }

  public String toString() {
   return pprint("STR",value);
  }


}
