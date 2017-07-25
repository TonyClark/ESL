package instrs.ops;

import runtime.actors.Actor;
import runtime.data.Key;

public class LocalRef extends Ref {

  int index;

  public LocalRef(int line, int index, Key[] names) {
    super(line, names);
    this.index = index;
  }

  public void perform(Actor actor) {
    performRefs(actor, actor.getFrameVar(index), 0);
  }

}
