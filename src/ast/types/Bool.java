package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Bool extends Type {

  public static final Type BOOL = new Bool();

  public Bool() {
  }

  public String toString() {
    return "Bool";
  }

  public boolean equals(Object other) {
    return other instanceof Bool;
  }

  public Type eval(Env<String, Type> env) {
    return this;
  }

}
