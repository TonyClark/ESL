package actors;

import java.util.Arrays;

public class Record {

  Field[] fields;

  public Record(Field... fields) {
    super();
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
    return "Record(" + Arrays.toString(fields) + ")";
  }

}
