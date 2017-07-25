package instrs.patterns;

import ast.refs.Ref;
import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Bag;

public class IsEmptyBag extends Instr {

  Ref ref;

  public IsEmptyBag(int line, Ref ref) {
    super(line);
    this.ref = ref;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Bag) {
      Bag bag = (Bag) o;
      if (!bag.isEmpty()) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return pprint("ISEMPTYBAG",ref);
  }

}
