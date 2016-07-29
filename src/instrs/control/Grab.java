package instrs.control;

import actors.Actor;
import actors.Dynamic;
import instrs.Instr;

public class Grab extends Instr {

  int dynamics;

  public Grab(int line, int dynamics) {
    super(line);
    this.dynamics = dynamics;
  }

  public void perform(Actor actor) {
    if (actor.canGrab(dynamics)) {
      for (int i = 0; i < dynamics; i++) {
        Dynamic dynamic = (Dynamic) actor.popStack();
        dynamic.setOwner(actor);
      }
    } else {
      actor.grabBlocked();
    }
  }

}
