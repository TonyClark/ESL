package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Box extends Type {

  public Type type;

  public Box() {
  }

  public Box(Type type) {
    super();
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String toString() {
    return "Box(" + type + ")";
  }

  public Type eval(Env<String, Type> env) {
    return new Box(type.eval(env));
  }

}
