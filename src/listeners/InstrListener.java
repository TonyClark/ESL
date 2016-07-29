package listeners;

import actors.Actor;
import instrs.Instr;

public interface InstrListener {

  public static InstrListener NOOP = new InstrListener() {
    public void perform(Actor actor) {
      if (Actor.debug) System.out.println("NEXT = " + actor.nextInstr());
    }
  };

  public void perform(Actor actor);

}
