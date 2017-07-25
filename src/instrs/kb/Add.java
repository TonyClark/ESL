package instrs.kb;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Term;
import runtime.kb.KB;

public class Add extends Instr {

  public Add(int line) {
    super(line);
  }

  public String toString() {
    return pprint("KBADD");
  }

  public void perform(Actor actor) {
    int time = (int) actor.popStack();
    Term o = (Term) actor.popStack();
    KB kb = (KB) actor.popStack();
    // Need to grab the KB in case it is shared...
    kb.grab(actor);
    kb.add(actor, o, time);
    kb.release();
    actor.pushStack(kb);
  }

}
