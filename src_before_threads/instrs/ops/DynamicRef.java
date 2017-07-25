package instrs.ops;

import java.util.Arrays;

import runtime.actors.Actor;
import runtime.data.Key;

public class DynamicRef extends Ref {

  int index;

  public DynamicRef(int line, int index, Key[] names) {
    super(line, names);
    this.index = index;
  }

  public void perform(Actor actor) {
    performRefs(actor, actor.getDynamic(index), 0);
  }

}
