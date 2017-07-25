package edb.type;

import ast.types.Type;

public class HandlerType {

  Type type;

  public HandlerType(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public String toString() {
    return type.toString();
  }

}
