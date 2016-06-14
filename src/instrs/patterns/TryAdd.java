package instrs.patterns;

import actors.Actor;
import actors.Bag;
import actors.Set;
import ast.refs.Ref;
import instrs.Instr;

public class TryAdd extends Instr {

  int id;
  Ref ref;

  public TryAdd(int line, int id, Ref ref) {
    super(line);
    this.id = id;
    this.ref = ref;
  }

  public String toString() {
    return pprint("TRYADD",id,ref);
  }

  public void perform(Actor actor) {

    // Pattern p + q is overloaded for all collections. We can work it out
    // at run-time...

    Object o = ref.ref(actor);
    if (o instanceof list.List<?>)
      actor.tryAddLists((list.List<Object>) o, id);
    else if (o instanceof Bag) {
      Bag bag = (Bag) o;
      bag.shuffle();
      actor.tryAddBags(bag, id);
    } else if (o instanceof Set) {
      Set set = (Set) o;
      set.shuffle();
      actor.tryAddSets(set, id);
    } else actor.fail();
  }

}
