package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Bag extends Type {

  public static final Type NIL = new Forall(0, 0, new String[] { "T" }, new Bag(0, 0, new Var(0, 0, "T", null)));

  public Type              type;

  public Bag() {
  }

  public Bag(int lineStart, int lineEnd, Type type) {
    super(lineStart, lineEnd);
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Type substType(Type t, String name) {
    return new Bag(getLineStart(), getLineEnd(), type.substType(t, name));
  }

  public String toString() {
    return "Bag{" + type + "}";
  }

  public void check(Env<String, Type> env) {
    type.check(env);
  }

}
