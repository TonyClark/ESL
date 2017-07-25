package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Unfold extends Type {

  public Type              type;

  public Unfold() {
  }

  public Unfold(int lineStart, int lineEnd, Type type) {
    super(lineStart, lineEnd);
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String toString() {
    return "unfold[" + type + "]";
  }

  public Type substType(Type t, String name) {
    return new Unfold(getLineStart(), getLineEnd(), type.substType(t, name));
  }

  public void check(Env<String, Type> env) {
    type.check(env);
  }

}
