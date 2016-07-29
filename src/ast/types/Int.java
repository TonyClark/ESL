package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Int extends Type {

  public static final Type INT = new Int();

  public Int() {
  }

  public String toString() {
    return "Int";
  }

  public Type substType(Type type, String name) {
    return this;
  }

}
