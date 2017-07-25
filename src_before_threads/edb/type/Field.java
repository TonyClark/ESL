package edb.type;

import ast.types.Type;

public class Field {

  String name;
  Type   type;
  String value;

  public Field(String name, Type type, String value) {
    this.name = name;
    this.type = type;
    this.value = value;
  }

  public String toString() {
    return name + "::" + type + "=" + value;
  }

}
