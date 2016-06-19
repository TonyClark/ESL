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

  public boolean equals(Object other) {
    return other instanceof Int;
  }

  public Type eval(Env<String, Type> env) {
    return this;
  }

}
