package instrs.jumps;

import instrs.Instr;
import runtime.actors.Actor;

public class SkipFalse extends Instr {

  {
    code = SKIPFALSE;
  }

  public int count;

  public SkipFalse(int line, int count) {
    super(line);
    this.count = count;
  }

  public void perform(Actor actor) {
    // Instruction counter has already been advanced...
    if (!(boolean) actor.popStack()) actor.incCodePtr(count - 1);
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String toString() {
    return pprint("SKIPFALSE", count);
  }

}
