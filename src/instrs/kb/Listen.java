package instrs.kb;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.kb.KB;
import runtime.network.Network;

public class Listen extends Instr {

  public Listen(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    KB kb = (KB) actor.popStack();
    Network network = (Network) actor.popStack();
    kb.addListener(network);
    actor.pushStack(network);
  }

}
