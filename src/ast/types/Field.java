package ast.types;

import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "type" })

public class Field implements Located {

  public String name;
  public Type   type;
  int           line;

  public Field() {
  }

  public Field(String name, Type type) {
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

  public int getLine() {
    return line;
  }

  public void setLine(int line) {
    this.line = line;
  }

  public String toString() {
    return name + ":" + type;
  }

  public Field eval(Env<String, Type> env) {
    return new Field(name,type.eval(env));
  }

}
