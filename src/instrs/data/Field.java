package instrs.data;

import actors.Actor;
import actors.Key;
import instrs.Instr;

public class Field extends Instr {

  Key name;

  public Field(Key name) {
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
