package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Key;

public class Field extends Instr {

  Key name;

  public Field(int line, Key name) {
    super(line);
    this.name = name;
  }

  public void perform(Actor actor) {
    actor.pushStack(new runtime.data.Field(name, actor.popStack()));
  }

  public String toString() {
   return pprint("FIELD",name.getString());
  }

}
