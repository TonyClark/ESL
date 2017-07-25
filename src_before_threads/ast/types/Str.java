package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Str extends Type {

  public static final Type STR = new Str();

  public Str() {
  }

  public String toString() {
    return "Str";
  }

  public boolean equals(Object other) {
    return other instanceof Str;
  }

  public Type substType(Type type, String name) {
    return this;
  }

  public void check(Env<String, Type> env) {
    
  }

}
