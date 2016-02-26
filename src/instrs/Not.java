package instrs;

import actors.Actor;

public class Not extends Instr {

  public void perform(Actor actor) {
    boolean b = (boolean)actor.popStack();
    actor.pushStack(!b);
  }

}
