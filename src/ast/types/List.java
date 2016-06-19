package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class List extends Type {

  public static final Type NIL = new Forall("T", new List(new Var("T")));
  
  public Type              type;

  public List() {
  }

  public List(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Type eval(Env<String, Type> env) {
    return new List(type.eval(env));
  }

}
