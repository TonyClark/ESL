package instrs.data;

import actors.Actor;
import actors.Key;
import instrs.Instr;

public class Term extends Instr {

  Key name;
  int arity;

  public Term(int line, Key name, int arity) {
    super(line);
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object[] values = new Object[arity];
    for (int i = arity - 1; i >= 0; i--)
      values[i] = actor.popStack();
    actor.pushStack(new actors.Term(name, values));
  }

  public String toString() {
   return pprint("TERM",name.getString(),arity);
  }


}
