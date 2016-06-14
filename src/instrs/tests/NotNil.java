package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class NotNil extends Instr {

  public NotNil(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    list.List<Object> l = (list.List) actor.popStack();
    actor.pushStack(!l.isNil());
  }

  public String toString() {
    return pprint("NOTNIL");
  }

}
