package instrs;

import actors.Actor;
import actors.CodeBox;

public class Behaviour extends Instr {

  String  name;
  int     initIndex;
  CodeBox code;

  public Behaviour(String name, int initIndex, CodeBox code) {
    this.name = name;
    this.initIndex = initIndex;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Behaviour(name, actor.getDynamics(), initIndex, code));
  }

  public String toString() {
    return "Behaviour(" + name + "," + code + ")";
  }

}
