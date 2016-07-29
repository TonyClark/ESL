package listeners;

import actors.Actor;
import actors.JavaActor;

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
