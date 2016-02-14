package instrs;

import actors.Actor;
import actors.CodeBox;

public class Behaviour extends Instr {

  String  name;
  CodeBox code;

  public Behaviour(String name, CodeBox code) {
    this.name = name;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Behaviour(name, actor.getDynamics(), code));
  }

  public String toString() {
    return "Behaviour(" + code + ")";
  }

}
