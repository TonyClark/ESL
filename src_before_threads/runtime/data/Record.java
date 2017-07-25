package runtime.data;

import java.io.Serializable;
import java.util.Arrays;

public class Record implements Serializable {

  Field[] fields;

  public Record(Field... fields) {
    super();
    this.fields = fields;
  }

  public boolean hasField(Key name) {
    for (Field field : fields)
      if (field.getName() == name) return true;
    return false;
  }

  public Field getField(Key name) {
    for (Field field : fields)
      if (field.getName() == name) return field;
    return null;
  }

  public String toString() {
    String s = "{";
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      s = s + f.getName().getString() + "=" + f.getValue();
      if (i + 1 < fields.length) s = s + ";";
    }
    return s + "}";
  }

  public Field[] getFields() {
    return fields;
  }

}
