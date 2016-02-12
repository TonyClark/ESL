package actors;

public class Dynamic {

  Object value;

  public Dynamic(Object value) {
    this.value = value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String toString() {
    return value.toString();
  }

  public Object getValue() {
    return value;
  }
}
