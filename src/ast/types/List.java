package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class List extends Type {

  public static final Type NIL = new Forall(0, 0, new String[] { "T" }, new List(0, 0, new Var(0,0,"T",null)));

  public Type              type;

  public List() {
  }

  public List(int lineStart, int lineEnd, Type type) {
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
    return "[" + type + "]";
  }

  public Type substType(Type t, String name) {
    return new List(getLineStart(), getLineEnd(), type.substType(t, name));
  }

}
