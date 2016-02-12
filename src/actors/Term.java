package actors;

import java.util.Arrays;

public class Term {
  String   name;
  Object[] values;

  public Term(String name, Object[] values) {
    super();
    this.name = name;
    this.values = values;
  }

  public String getName() {
    return name;
  }

  public Object[] getValues() {
    return values;
  }

  public String toString() {
    return name + Arrays.toString(values);
  }
}
