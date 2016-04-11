package actors;

import java.util.Arrays;

public class Record {

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
    return "Record(" + Arrays.toString(fields) + ")";
  }

}
