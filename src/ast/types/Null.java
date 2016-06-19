package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Null extends Type {

  public static final Type NULL = new Null();;

  public Null() {
  }

  public String toString() {
    return "Null";
  }

  public boolean equals(Object other) {
    return other instanceof Null;
  }

  public Type eval(Env<String, Type> env) {
    return this;
  }

}
