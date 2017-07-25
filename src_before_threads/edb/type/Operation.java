package edb.type;

import ast.types.Type;

public class Operation {

  String name;
  Type   type;

  public Operation(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public String toString() {
    return name + "::" + type;
  }

}
