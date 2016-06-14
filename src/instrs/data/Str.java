package instrs.data;

import actors.Actor;
import instrs.Instr;

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
