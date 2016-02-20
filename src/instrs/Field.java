package instrs;

import actors.Actor;

public class Field extends Instr {

  String name;

  public Field(String name) {
    super();
    this.name = name;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Field(name, actor.popStack()));
  }

  public String toString() {
    return "Field(" + name + ")";
  }

}
