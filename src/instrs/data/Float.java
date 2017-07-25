package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Float extends Instr {

  Number number;

  public Float(int line, Number number) {
    super(line);
    this.number = number;
  }

  public void perform(Actor actor) {
    actor.pushStack(number);
  }

}
