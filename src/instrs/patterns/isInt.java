package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class isInt extends Instr {

  Ref ref;
  int value;

  public isInt(Ref ref, int value) {
    super();
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
    return "IsInt(" + ref + "," + value + ")";
  }

}
