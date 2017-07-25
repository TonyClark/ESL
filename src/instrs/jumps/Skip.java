package instrs.jumps;

import instrs.Instr;
import runtime.actors.Actor;

public class Skip extends Instr {

  {
    code = SKIP;
  }

  public int count;

  public Skip(int line, int count) {
    super(line);
    this.count = count;
  }

  public void perform(Actor actor) {
    // Instruction counter has already been advanced...
    actor.incCodePtr(count - 1);
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String toString() {
    return pprint("SKIP", count);
  }

}
