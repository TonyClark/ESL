package instrs.debug;

import instrs.Instr;
import runtime.actors.Actor;

public class EnterTracedFun extends Instr {

  int arity;

  public EnterTracedFun(int line, int arity) {
    super(line);
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object name = actor.popStack();
    System.out.println("ENTER: " + name);
    for (int i = 0; i < arity; i++) {
      System.out.println("ARG " + i + " = " + actor.popStack());
    }
  }

}
