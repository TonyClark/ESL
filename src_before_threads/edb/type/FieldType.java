package edb.type;

import ast.types.Type;

public class FieldType {

  String name;
  Type   type;

  public FieldType(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public String toString() {
    return name + "::" + type;
  }

}
