package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Float extends Type {

  public static Float FLOAT = new Float();

  public Float() {
  }

  public String toString() {
    return "Float";
  }

  public Type eval(Env<String, Type> env) {
    return this;
  }

}
