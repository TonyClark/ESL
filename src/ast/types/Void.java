package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Void extends Type {

  public static final Type VOID = new Void();

  public Void() {
  }

  public String toString() {
    return "Void";
  }

  public Type substType(Type type, String name) {
    return this;
  }

  public void check(Env<String, Type> env) {
  }

  public void FV(HashSet<String> vars) {
  }

}
