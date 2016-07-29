package listeners;

import actors.Actor;

public interface ScheduleListener {

  public static ScheduleListener NOOP = new ScheduleListener() {
    public void schedule(Actor actor) {
    }

    public void deschedule(Actor actor) {
    }
  };

  public void schedule(Actor actor);

  public void deschedule(Actor actor);

}
