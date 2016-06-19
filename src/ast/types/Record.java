package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "fields" })

public class Record extends Type {

  public Field[] fields;

  public Record() {
  }

  public Record(Field[] fields) {
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
    String s = "{ ";
    for (int i = 0; i < fields.length; i++) {
      s = s + fields[i];
      if (i + 1 < fields.length) s = s + "; ";
    }
    return s + " }";
  }

  public Type eval(Env<String, Type> env) {
    Field[] fs = new Field[fields.length];
    for (int i = 0; i < fs.length; i++)
      fs[i] = fields[i].eval(env);
    return new Record(fs);
  }

}
