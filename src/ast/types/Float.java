package ast.types;

import java.util.HashSet;

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

  public Type substType(Type type, String name) {
    return this;
  }

  public void check(Env<String, Type> env) {
  }

  public void FV(HashSet<String> vars) {
  }

}
