package instrs.patterns;

import ast.refs.Ref;
import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Set;

public class TrySet extends Instr {

  int id;
  Ref ref;

  public TrySet(int line, int id, Ref ref) {
    super(line);
    this.id = id;
    this.ref = ref;
  }

  public String toString() {
    return pprint("TRYSET",id,ref);
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Set) {
      Set set = (Set) o;
      if (set.isEmpty())
        actor.fail();
      else {
        set.shuffle();
        actor.trySet(set, id);
      }
    } else actor.fail();
  }

}
