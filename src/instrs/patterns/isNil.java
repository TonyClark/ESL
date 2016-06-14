package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isNil extends Instr {

  Ref ref;

  public isNil(int line, Ref ref) {
    super(line);
    this.ref = ref;
  }

  public void perform(Actor actor) {
    if (!(ref.ref(actor) instanceof list.Nil<?>)) actor.fail();
  }

  public String toString() {
    return pprint("ISNIL",ref);
  }

}
