package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type", "name" })
public class UnionRef extends Type {

  public Type   type;
  public String name;

  public UnionRef() {
  }

  public UnionRef(int lineStart, int lineEnd, Type type, String name) {
    super(lineStart, lineEnd);
    this.type = type;
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return type + "." + name;
  }

  public Type substType(Type t, String n) {
    return new UnionRef(getLineStart(), getLineEnd(), type.substType(t, n), name);
  }

}
