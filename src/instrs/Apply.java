package instrs;

import actors.Actor;

public class Apply extends Instr {

  int arity;

  public Apply(int arity) {
    this.arity = arity;
  }

  public String toString() {
    return "@";
  }

  public void perform(Actor actor) {
    actors.Fun fun = (actors.Fun) actor.popStack();
    actor.closeFrame(fun.getCode().getLocals() - fun.getArity(), fun.getCode(), fun.getDynamics());
  }

}
