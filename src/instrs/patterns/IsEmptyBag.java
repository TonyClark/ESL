package instrs.patterns;

import actors.Actor;
import actors.Bag;
import ast.refs.Ref;
import instrs.Instr;

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
