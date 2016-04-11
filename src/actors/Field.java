package actors;

public class Field {

  Key    name;
  Object value;

  public Field(Key name, Object value) {
    super();
    this.name = name;
    this.value = value;
  }

  public Key getName() {
    return name;
  }

  public Object getValue() {
    return value;
  }

  public String toString() {
    return "Field(" + name + "," + value + ")";
  }

}
