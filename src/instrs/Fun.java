package instrs;

import actors.Actor;
import actors.CodeBox;

public class Fun extends Instr {

  int     arity;
  CodeBox code;

  public Fun(int arity, CodeBox codeBox) {
    super();
    this.arity = arity;
    this.code = codeBox;
  }

  public String toString() {
    return "Fun(" + arity + "," + code + ")";
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Fun(arity, actor.getDynamics(), code));
  }
}
