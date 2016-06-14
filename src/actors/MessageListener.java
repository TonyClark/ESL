package actors;

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
