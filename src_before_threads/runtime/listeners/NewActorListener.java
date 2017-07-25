package runtime.listeners;

import runtime.actors.Actor;
import runtime.actors.JavaActor;

public interface NewActorListener {

  public static NewActorListener NOOP = new NewActorListener() {
    public void newActor(Actor actor) {
    }

    public void newActor(JavaActor actor) {
    }
  };

  public void newActor(Actor actor);

  public void newActor(JavaActor actor);

}
