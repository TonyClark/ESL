package instrs.tests;

import instrs.Instr;
import runtime.actors.Actor;

public class IsTerm extends Instr {

  String name;
  int    arity;

  public IsTerm(int line, String name, int arity) {
    super(line);
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object o = actor.popStack();
    if (o instanceof runtime.data.Term) {
      runtime.data.Term t = (runtime.data.Term) o;
      if (t.getName().equals(name) && t.getValues().length == arity)
        actor.pushStack(true);
      else actor.pushStack(false);
    } else actor.pushStack(false);
  }

  public String toString() {
    return pprint("ISTERM",name,arity);
  }

}
