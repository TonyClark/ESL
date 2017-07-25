package instrs.patterns;

import ast.refs.Ref;
import instrs.Instr;
import runtime.actors.Actor;

public class isInt extends Instr {

  Ref ref;
  int value;

  public isInt(int line, Ref ref, int value) {
    super(line);
    this.ref = ref;
    this.value = value;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Integer) {
      if (value != (int) o) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return pprint("ISINT",ref,value);
  }

}
