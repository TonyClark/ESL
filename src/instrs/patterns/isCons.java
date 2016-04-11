package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isCons extends Instr {

  Ref ref;

  public isCons(Ref ref) {
    super();
    this.ref = ref;
  }

  public void perform(Actor actor) {
    if (!(ref.ref(actor) instanceof list.Cons)) actor.fail();
  }

  public String toString() {
    return "IsCons(" + ref + ")";
  }

}
