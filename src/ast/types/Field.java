package ast.types;

import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "type" })

public class Field implements Located {

  public String name;
  public Type   type;
  int           lineStart = -1;
  int           lineEnd = -1;

  public Field() {
  }

  public Field(int lineStart, int lineEnd, String name, Type type) {
    setLineStart(lineStart);
    setLineEnd(lineEnd);
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

  public int getLineStart() {
    return lineStart;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public String toString() {
    return name + ":" + type;
  }

  public Field substType(Type t, String n) {
    return new Field(getLineStart(), getLineEnd(), name, type.substType(t, n));
  }

  public boolean equals(Field field, Env<String, Type> env) {
    return name.equals(field.getName()) && Type.equals(type, field.getType(), env);
  }

}
