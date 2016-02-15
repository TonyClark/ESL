package instrs;

import actors.Actor;

public class Become extends Instr {

  public String toString() {
    return "Become";
  }

  public void perform(Actor actor) {
    actors.Behaviour act = (actors.Behaviour) actor.tos();
    actor.setBehaviour(act);
  }

}
