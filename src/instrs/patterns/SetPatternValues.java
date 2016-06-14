package instrs.patterns;

import actors.Actor;
import instrs.Instr;

public class SetPatternValues extends Instr {

  int length;

  public SetPatternValues(int line, int length) {
    super(line);
    this.length = length;
  }

  public void perform(Actor actor) {
    for (int i = length - 1; i >= 0; i--)
      actor.setPatternValue(actor.popStack(), i);
  }

  public String toString() {
    return pprint("SETPATVALS",length);
  }

}
