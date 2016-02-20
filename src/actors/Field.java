package actors;

public class Field {

  String name;
  Object value;

  public Field(String name, Object value) {
    super();
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public Object getValue() {
    return value;
  }

  public String toString() {
    return "Field(" + name + "," + value + ")";
  }

}
