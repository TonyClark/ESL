package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "types" })
public class Term extends Type {

  public String name;
  public Type[] types;

  public Term() {
  }

  public Term(String name, Type[] types) {
    this.name = name;
    this.types = types;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type[] getTypes() {
    return types;
  }

  public void setTypes(Type[] types) {
    this.types = types;
  }

  public Type eval(Env<String, Type> env) {
    Type[] ts = new Type[types.length];
    for (int i = 0; i < ts.length; i++)
      ts[i] = types[i].eval(env);
    return new Term(name, ts);
  }

}
