package instrs.data;

import actors.Actor;
import instrs.Instr;

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
