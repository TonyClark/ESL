package actors;

public class Message {

  // A message is a value waiting to be delivered to an actor.
  // The time is the earliest time that the value can be delivered.
  // If the time is 0 then the message can be delivered at any time.

  Object value;
  int    time;

  public Message(Object value, int time) {
    this.value = value;
    this.time = time;
  }

  public String toString() {
    return "Message(" + value + "," + time + ")";
  }

  public Object getValue() {
    return value;
  }

  public int getTime() {
    return time;
  }

}
