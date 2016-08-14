package listeners;

import actors.Actor;
import actors.JavaActor;
import actors.Message;

public interface MessageListener {

  public static MessageListener NOOP = new MessageListener() {
    public void addMessage(Actor source, Actor target, Message message) {
    }

    public void deleteMessage(Actor actor, Message message) {
    }

    public void addMessage(JavaActor source, Actor target, Message message) {
    }
  };

  public void addMessage(Actor source, Actor target, Message message);

  public void addMessage(JavaActor source, Actor target, Message message);

  public void deleteMessage(Actor actor, Message message);

}
