package instrs.vars;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Key;

public class DynamicRef extends Instr {

  Key name;

  public DynamicRef(int line, Key name) {
    super(line);
    this.name = name;
  }

  public void perform(Actor actor) {
    Actor a = (Actor) actor.popStack();
    runtime.data.Dynamic dynamic = a.dynamicRef(name);
    actor.pushStack(dynamic);
  }

}
