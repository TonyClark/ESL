package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Set extends Type {

  public static final Type NIL = new Forall("T", new Set(new Var("T")));

  public Type              type;

  public Set() {
  }

  public Set(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Type eval(Env<String, Type> env) {
    return new Set(type.eval(env));
  }

}
