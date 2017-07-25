package instrs.query;

import instrs.Instr;
import runtime.actors.Actor;

public class QRecons extends Instr {

  public QRecons(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.qRecons();
  }

}
