package instrs.ops;

import instrs.Instr;
import list.List;
import runtime.actors.Actor;

public class Flatten extends Instr {

  {
    code = FLATTEN;
  }

  public Flatten(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    List<List<Object>> ls = (List) actor.popStack();
    actor.pushStack(List.flatten(ls));
  }

  public String toString() {
    return pprint("FLATTEN");
  }

}
