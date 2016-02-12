package instrs;

import actors.Actor;

public class Skip extends Instr {

  int count;

  public Skip(int count) {
    this.count = count;
  }

  public void perform(Actor actor) {
    // Instruction counter has already been advanced...
    actor.incCodePtr(count-1);
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String toString() {
    return "Skip(" + count + ")";
  }

}
