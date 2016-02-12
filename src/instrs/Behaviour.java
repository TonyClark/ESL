package instrs;

import actors.Actor;
import actors.CodeBox;

public class Behaviour extends Instr {

  int     arity;
  CodeBox code;

  public Behaviour(int arity, CodeBox code) {
    this.arity = arity;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Behaviour(arity, actor.getDynamics(), code));
  }

  public String toString() {
    return "Behaviour(" + arity + "," + code + ")";
  }

}
