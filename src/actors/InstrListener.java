package actors;

import instrs.Instr;

public interface InstrListener {

  public static InstrListener NOOP = new InstrListener() {
    public void perform(Actor actor, Instr instr) {
      if (Actor.debug) System.out.println("NEXT = " + instr);
    }
  };

  public void perform(Actor actor, Instr instr);

}
