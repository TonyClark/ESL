package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Term;
import runtime.network.Network;

public class Monitor extends Instr {

  public Monitor(int line) {
    super(line);
  }

  public String toString() {
    return pprint("Monitor");
  }

  public void perform(Actor actor) {
    Term term = (Term)actor.popStack();
    ast.monitors.rules.Rules rules = ast.monitors.rules.Rules.inflate(term);
    rules.addToNetwork();
    actor.pushStack(Network.getNetwork());
  }

}
