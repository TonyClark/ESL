package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isStr extends Instr {

  Ref    ref;
  String value;

  public isStr(int line, Ref ref, String value) {
    super(line);
    this.ref = ref;
    this.value = value;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof String) {
      if (!value.equals((String) o)) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return pprint("ISSTR",ref,value);
  }

}
