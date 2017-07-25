package instrs.query.data;

import instrs.Instr;
import runtime.actors.Actor;

public class NewLogicalVar extends Instr {

  public NewLogicalVar(int line) {
    super(line);
  }

  public void perform(Actor actor) {
    actor.pushStack(new ast.query.value.Var());
  }

}
