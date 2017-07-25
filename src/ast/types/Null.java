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

  public Type substType(Type type, String name) {
    return this;
  }

  public void check(Env<String, Type> env) {
    
  }

}
