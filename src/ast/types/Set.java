package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Set extends Type {

  public static final Type NIL = new Forall(0, 0, new String[] { "T" }, new Set(0, 0, new Var(0, 0, "T", null)));

  public Type              type;

  public Set() {
  }

  public Set(int lineStart, int lineEnd, Type type) {
    super(lineStart, lineEnd);
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Type substType(Type type, String name) {
    return new Set(getLineStart(), getLineEnd(), type.substType(type, name));
  }

  public String toString() {
    return "Set{" + type + "}";
  }

  public void check(Env<String, Type> env) {
    type.check(env);
  }

  public void FV(HashSet<String> vars) {
    type.FV(vars);
  }

}
