package ast.java.types;

public class Bag extends Type {

  Type type;
  
  public Bag(ast.java.types.Type type) {
    this.type = type;
  }

  public String toString() {
    return "Bag<" + type.toArgString() + ">";
  }

  public String toArgString() {
    return "Bag<" + type.toArgString() + ">";
  }

}
