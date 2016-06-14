package instrs.vars;

import actors.Actor;
import instrs.Instr;

public class SubDynamic extends Instr {

  int index;
  int value;

  public SubDynamic(int line, int index, int value) {
    super(line);
    this.index = index;
    this.value = value;
  }

  public void perform(Actor actor) {
    actor.setDynamic(index, (int)actor.getDynamic(index) - 1);
  }


  public String toString() {
   return pprint("SUBDYNAMIC",index);
  }
}
