package instrs.vars;

import actors.Actor;
import actors.Key;
import instrs.Instr;

public class DynamicRef extends Instr {

  Key name;

  public DynamicRef(int line, Key name) {
    super(line);
    this.name = name;
  }

  public void perform(Actor actor) {
    Actor a = (Actor) actor.popStack();
    actors.Dynamic dynamic = a.dynamicRef(name);
    actor.pushStack(dynamic);
  }

}
