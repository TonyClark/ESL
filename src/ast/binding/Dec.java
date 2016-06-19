package ast.binding;

import ast.types.Type;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "type" })

public class Dec {

  public String path;
  public String name;
  public Type   type;

  public Dec() {
  }

  public Dec(String path, String name, Type type) {
    super();
    this.path = path;
    this.name = name;
    this.type = type;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

}
