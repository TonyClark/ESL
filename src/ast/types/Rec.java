package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "type" })
public class Rec extends Type {

  public String name;
  public Type   type;

  public Rec() {
  }

  public Rec(int lineStart, int lineEnd, String name, Type type) {
    super(lineStart, lineEnd);
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String toString() {
    return "rec " + name + ". " + type;
  } 

  public Type substType(Type t, String name) {
    if (name.equals(getName()))
      return this;
    else return new Rec(getLineStart(), getLineEnd(), getName(), type.substType(t, name));
  }

  public String getLabel() {
    return "rec " + name;
  }

  public Type unfold() {
    return type.substType(this, name);
  }

}
