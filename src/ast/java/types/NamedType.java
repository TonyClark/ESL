package ast.java.types;

public class NamedType extends Type {

  String name;

  public NamedType(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

}
