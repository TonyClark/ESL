package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })
public class Var extends Type {

  public String name;

  public Var() {
  }

  public Var(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

  public Type eval(Env<String, Type> env) {
    if (env.binds(name))
      return env.lookup(name);
    else throw new TypeError(this, "unbound type variable " + name);
  }

}
