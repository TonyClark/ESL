package runtime.listeners;

import runtime.actors.Actor;
import runtime.data.Key;

public interface UpdateListener {

  public static UpdateListener NOOP = new UpdateListener() {
    public void update(Actor actor, String name, Object value, int time) {
    }
  };

  public void update(Actor actor, String name, Object value, int time);

}
