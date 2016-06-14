package instrs.data;

import actors.Actor;
import actors.Key;
import instrs.Instr;

public class Field extends Instr {

  Key name;

  public Field(int line, Key name) {
    super(line);
    this.name = name;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Field(name, actor.popStack()));
  }

  public String toString() {
   return pprint("FIELD",name.getString());
  }

}
