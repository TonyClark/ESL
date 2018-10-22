package instrs.kb;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.kb.KB;

public class AsList extends Instr {

  public AsList(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    KB kb = (KB) actor.popStack();
    actor.pushStack(kb.asList());
  }

}
