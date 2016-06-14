package instrs.patterns;

import actors.Actor;
import actors.Bag;
import ast.refs.Ref;
import instrs.Instr;

public class TryBag extends Instr {

  int id;
  Ref ref;

  public TryBag(int line, int id, Ref ref) {
    super(line);
    this.id = id;
    this.ref = ref;
  }

  public String toString() {
    return pprint("TRYBAG",id,ref);
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Bag) {
      Bag bag = (Bag) o;
      if (bag.isEmpty())
        actor.fail();
      else {
        bag.shuffle();
        actor.tryBag(bag, id);
      }
    } else actor.fail();
  }

}
