package instrs;

import actors.Actor;
import actors.CodeBox;

public class Fun extends Instr {

  String  name;
  int     arity;
  CodeBox code;

  public Fun(String name, int arity, CodeBox codeBox) {
    super();
    this.name = name;
    this.arity = arity;
    this.code = codeBox;
  }

  public String toString() {
    return "Fun(" + name + "," + arity + "," + code + ")";
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Closure(name, arity, actor.getDynamics(), code));
  }
}
