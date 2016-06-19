package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "type" })
public class Forall extends Type {

  String name;
  Type   type;

  public Forall() {
  }

  public Forall(String name, Type type) {
    super();
    this.name = name;
    this.type = type;
  }

  public Type eval(Env<String, Type> env) {
    return new Forall(name,type.eval(env));
  }

}
