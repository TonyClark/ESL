package instrs.patterns;

import ast.refs.Ref;
import instrs.Instr;
import runtime.actors.Actor;

public class isCons extends Instr {

  Ref ref;

  public isCons(int line, Ref ref) {
    super(line);
    this.ref = ref;
  }

  public void perform(Actor actor) {
    if (!(ref.ref(actor) instanceof list.Cons)) actor.fail();
  }

  public String toString() {
    return pprint("ISCONS",ref);
  }

}
