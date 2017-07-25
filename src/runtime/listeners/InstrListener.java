package runtime.listeners;

import instrs.Instr;
import runtime.ESL;
import runtime.actors.Actor;

public interface InstrListener {

  public static InstrListener NOOP = new InstrListener() {
    public void perform(Actor actor) {
      if (ESL.isDebug()) System.out.println("NEXT = " + actor.nextInstr());
    }
  };

  public void perform(Actor actor);

}
