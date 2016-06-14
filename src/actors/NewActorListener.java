package actors;

public interface NewActorListener {

  public static NewActorListener NOOP = new NewActorListener() {
    public void newActor(Actor actor) {
    }
  };

  public void newActor(Actor actor);

}
