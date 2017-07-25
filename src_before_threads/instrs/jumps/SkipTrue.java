package instrs.jumps;

import instrs.Instr;
import runtime.actors.Actor;

public class SkipTrue extends Instr {

  {
    code = SKIPTRUE;
  }

  public int count;

  public SkipTrue(int line, int count) {
    super(line);
    this.count = count;
  }

  public void perform(Actor actor) {
    // Instruction counter has already been advanced...
    if ((boolean) actor.popStack()) actor.incCodePtr(count - 1);
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String toString() {
    return pprint("SKIPTRUE", count);
  }

}
