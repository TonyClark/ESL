package instrs.apply;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.functions.CodeBox;

public class ApplyFun extends Instr {

  public int     arity;
  public CodeBox codeBox;

  {
    code = APPLYFUN;
  }

  public ApplyFun(int line, int arity, CodeBox codeox) {
    super(line);
    this.arity = arity;
    this.codeBox = codeBox;
  }

  public void perform(Actor actor) {
    actor.closeFrame(codeBox.getLocals() - arity, codeBox, actor.getDynamics(), null);
  }

  public String toString() {
    return pprint("APPLYFUN", arity);
  }

}
