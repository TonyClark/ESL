package instrs.patterns;

import ast.refs.Ref;
import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Set;

public class IsEmptySet extends Instr {

  Ref ref;

  public IsEmptySet(int line, Ref ref) {
    super(line);
    this.ref = ref;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Set) {
      Set set = (Set) o;
      if (!set.isEmpty()) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return pprint("ISEMPTYSET",ref);
  }

}
