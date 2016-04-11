package instrs.patterns;

import actors.Actor;
import instrs.Instr;

public class Try extends Instr {

  int     offset;
  boolean isFirst;

  public Try(int offset, boolean isFirst) {
    super();
    this.offset = offset;
    this.isFirst = isFirst;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public void perform(Actor actor) {
    if (isFirst) actor.failReset();
    actor.tryOption(offset);
  }

  public String toString() {
    return "Try(" + offset + "," + isFirst + ")";
  }

}
