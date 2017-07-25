package history;

import runtime.data.Key;

public class State extends Event {

  int    id;
  Key    name;
  Object value;

  public State(int id, Key name, Object value, int time) {
    super(time);
    this.id = id;
    this.name = name;
    this.value = value;
  }

  public int getId() {
    return id;
  }

  public Key getName() {
    return name;
  }

  public Object getValue() {
    return value;
  }

  public String toString() {
    return "State(" + id + "," + name + "," + value + "," + getTime() + ")";
  }

  public String pprint() {
    return name.getString() + " :=" + value;
  }

}
