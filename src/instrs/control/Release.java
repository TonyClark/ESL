package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Grabbable;

public class Release extends Instr {

  int dynamics;

  public Release(int line, int dynamics) {
    super(line);
    this.dynamics = dynamics;
  }

  public void perform(Actor actor) {
    for (int i = 0; i < dynamics; i++) {
      Grabbable grabbable = (Grabbable) actor.popStack();
      grabbable.release();
    }
  }

}
