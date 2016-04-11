package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isTrue extends Instr {

  Ref ref;

  public isTrue(Ref ref) {
    super();
    this.ref = ref;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Boolean) {
      if (o.equals(Boolean.FALSE)) actor.fail();
    } else actor.fail();
  }

}
