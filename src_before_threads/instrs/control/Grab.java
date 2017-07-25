package instrs.control;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Grabbable;

public class Grab extends Instr {

  int dynamics;

  public Grab(int line, int dynamics) {
    super(line);
    this.dynamics = dynamics;
  }

  public void perform(Actor actor) {
    if (actor.canGrab(dynamics)) {
      for (int i = 0; i < dynamics; i++) {
        Grabbable grabbable = (Grabbable) actor.popStack();
        grabbable.grab(actor);
      }
    } else {
      actor.grabBlocked();
    }
  }

}
