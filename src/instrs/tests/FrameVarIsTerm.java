package instrs.tests;

import actors.Actor;
import instrs.Instr;

public class FrameVarIsTerm extends Instr {

  String name;
  int    arity;

  int    index;

  public FrameVarIsTerm(String name, int arity, int index) {
    super();
    this.name = name;
    this.arity = arity;
    this.index = index;
  }

  public void perform(Actor actor) {
    Object o = actor.getFrameVar(index);
    if (o instanceof actors.Term) {
      actors.Term t = (actors.Term) o;
      if (t.getName().equals(name) && t.getValues().length == arity)
        actor.pushStack(true);
      else actor.pushStack(false);
    } else actor.pushStack(false);
  }

  public String toString() {
    return "FrameVarIsTerm(" + name + "," + arity + "," + index + ")";
  }

}
