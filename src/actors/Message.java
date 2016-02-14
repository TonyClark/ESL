package actors;

public class Message {

  Object value;

  public Message(Object value) {
    this.value = value;
  }

  public String toString() {
    return "Message(" + value + ")";
  }

  public Object getValue() {
    return value;
  }

}
