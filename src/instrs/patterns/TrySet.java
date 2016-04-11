package instrs.patterns;

import actors.Actor;
import actors.Set;
import ast.refs.Ref;
import instrs.Instr;

public class TrySet extends Instr {

  int id;
  Ref ref;

  public TrySet(int id, Ref ref) {
    super();
    this.id = id;
    this.ref = ref;
  }

  public String toString() {
    return "TrySet(" + id + "," + ref + ")";
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
