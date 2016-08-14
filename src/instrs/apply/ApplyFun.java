package instrs.apply;

import actors.Actor;
import actors.CodeBox;
import instrs.Instr;

public class ApplyFun extends Instr {

  int     arity;
  CodeBox code;

  public ApplyFun(int line,int arity, CodeBox code) {
    super(line);
    this.arity = arity;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.closeFrame(code.getLocals() - arity, code, actor.getDynamics(), null);
  }

  public String toString() {
    return pprint("APPLYFUN",arity);
  }

}
