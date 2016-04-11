package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class IsFalse extends Instr {

  Ref ref;

  public IsFalse(Ref ref) {
    super();
    this.ref = ref;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Boolean) {
      if (o.equals(Boolean.TRUE)) actor.fail();
    } else actor.fail();
  }

}
