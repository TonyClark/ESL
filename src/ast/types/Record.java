package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "fields" })

public class Record extends Type {

  public Field[] fields;

  public Record() {
  }

  public Record(int lineStart, int lineEnd, Field[] fields) {
    super(lineStart, lineEnd);
    this.fields = fields;
  }

  public Field[] getFields() {
    return fields;
  }

  public void setFields(Field[] fields) {
    this.fields = fields;
  }

  public boolean hasField(String name) {
    for (Field field : fields)
      if (field.getName().equals(name)) return true;
    return false;
  }

  public Field getField(String name) {
    for (Field field : fields)
      if (field.getName().equals(name)) return field;
    return null;
  }

  public String toString() {
    return "{" + separateWith(fields, ");") + "}";
  }

  public Type substType(Type type, String name) {
    return new Record(getLineStart(), getLineEnd(), substFields(type, name));
  }

  private Field[] substFields(Type type, String name) {
    Field[] fs = new Field[fields.length];
    for (int i = 0; i < fields.length; i++)
      fs[i] = fields[i].substType(type, name);
    return fs;
  }

  public void check(Env<String, Type> env) {
    for (Field field : fields)
      field.check(env);
  }

}
