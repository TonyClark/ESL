package actors;

public class Term {

  Key      name;
  Object[] values;

  public Term(Key name, Object... values) {
    super();
    this.name = name;
    this.values = values;
  }

  public Key getName() {
    return name;
  }

  public Object[] getValues() {
    return values;
  }

  public String toString() {
    return name.getString() + ((values.length == 0) ? "" : "(" + separate(",", values) + ")");
  }

  public boolean equals(Object other) {
    if (other instanceof Term) {
      Term t = (Term) other;
      if (t.getName() == name && t.getValues().length == values.length) {
        for (int i = 0; i < values.length; i++) {
          if (!values[i].equals(t.getValues()[i])) return false;
        }
        return true;
      } else return false;
    } else return false;
  }

  public static String separate(String sep, Object[] os) {
    StringBuffer sb = new StringBuffer("");
    for (int i = 0; os != null && i < os.length; i++) {
      sb.append(os[i]);
      if (i < os.length - 1) {
        sb.append(sep);
      }
    }
    return sb.toString();
  }

  public String getHTMLLabel() {
    String s = "<TABLE BORDER=\"0\" CELLBORDER=\"1\" CELLSPACING=\"0\">";
    s = s + "<TR><TD><FONT FACE=\"ITALIC\" POINT-SIZE=\"12\">" + name.getString() + "</FONT></TD></TR>";
    for (Object value : values)
      s = s + "<TR><TD><FONT POINT-SIZE=\"10\">" + value + "</FONT></TD></TR>";
    return s + "</TABLE>";
  }
}
