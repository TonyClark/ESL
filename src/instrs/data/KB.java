package instrs.data;

import java.util.Vector;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Term;

public class KB extends Instr {

  int length;

  public KB(int line, int length) {
    super(line);
    this.length = length;
  }

  public String toString() {
    return pprint("KB", length);
  }

  public void perform(Actor actor) {
    Vector<Term> l = new Vector<Term>();
    for (int i = 0; i < length; i++) {
      Term o = (Term) actor.popStack();
      if (!l.contains(o)) l.add(0, o);
    }
    actor.pushStack(new runtime.kb.KB(l, 0));
  }

}
