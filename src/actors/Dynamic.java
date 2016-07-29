package actors;

public class Dynamic {

  Object value;
  Actor  owner = null;

  public Dynamic(Object value) {
    this.value = value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String toString() {
    return value == null ? "null" : value.toString();
  }

  public Object getValue() {
    return value;
  }

  public Actor getOwner() {
    return owner;
  }

  public void setOwner(Actor owner) {
    this.owner = owner;
  }
}
