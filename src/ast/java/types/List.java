package ast.java.types;

public class List extends Type {

  Type type;

  public List(Type type) {
    this.type = type;
  }

  public String toString() {
    return "list.List<" + type.toArgString() + ">";
  }

  public String toArgString() {
    return "list.List<" + type.toArgString() + ">";
  }

}
