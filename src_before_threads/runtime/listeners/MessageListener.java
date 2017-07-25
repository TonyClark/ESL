package runtime.listeners;

import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.messages.Message;
import runtime.messages.MessageRecord;

public interface MessageListener {

  public static MessageListener NOOP = new MessageListener() {
    public void send(Actor source, Actor target, Message message) {
    }

    public void consume(Actor actor, Message message) {
    }

    public void send(JavaActor source, Actor target, Message message) {
    }

    public void send(int time, int source, int target, String name, Object[] values) {
    }

    public void send(int time, Actor actor, Actor target, String name, int arity) {
    }
  };

  public void send(Actor source, Actor target, Message message);

  public void send(JavaActor source, Actor target, Message message);

  public void consume(Actor actor, Message message);

  public void send(int time, int source, int target, String name, Object[] values);

  public void send(int time, Actor actor, Actor target, String name, int arity);

}
