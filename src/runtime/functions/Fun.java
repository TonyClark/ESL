package runtime.functions;

import runtime.actors.Actor;

public interface Fun {

  void apply(Actor actor, int arity);

}
