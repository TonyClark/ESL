package listeners;

import actors.Actor;
import actors.Message;

public interface MessageListener {

  public static MessageListener NOOP = new MessageListener() {
    public void addMessage(Actor actor, Message message) {
    }

    public void deleteMessage(Actor actor, Message message) {
    }
  };

  public void addMessage(Actor actor, Message message);

  public void deleteMessage(Actor actor, Message message);

}
