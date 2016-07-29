package instrs.control;

import actors.Actor;
import actors.Dynamic;
import instrs.Instr;

public class Release extends Instr {

  int dynamics;

  public Release(int line, int dynamics) {
    super(line);
    this.dynamics = dynamics;
  }

  public void perform(Actor actor) {
    for (int i = 0; i < dynamics; i++) {
      Dynamic dynamic = (Dynamic) actor.popStack();
      dynamic.setOwner(null);
    }
    Actor.notifyAllActors();
  }

}
