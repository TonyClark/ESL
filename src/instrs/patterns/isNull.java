package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isNull extends Instr {

  Ref ref;

  public isNull(int line, Ref ref) {
    super(line);
    this.ref = ref;
  }

  public void perform(Actor actor) {
    if (ref.ref(actor) != null) actor.fail();
  }

  public String toString() {
    return pprint("ISNULL",ref);
  }

}
