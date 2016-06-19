package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Bag extends Type {

  public static final Type NIL = new Forall("T", new Bag(new Var("T")));

  public Type              type;

  public Bag() {
  }

  public Bag(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Type eval(Env<String, Type> env) {
    return new Bag(type.eval(env));
  }

}
