package ast.java.types;

import java.io.PrintWriter;

public class Type {

  public static final Type ACTOR = new Type();;
  public static final Type INT   = new Type();
  public static final Type STR   = new Type();
  public static final Type BOOL  = new Type();
  public static final Type FLOAT = new Type();
  public static final Type TERM  = new Type();
  public static final Type OBJ   = new Type();

  public void write(PrintWriter out) {
    out.print(toString());
  }

  public String toString() {
    if (this == INT)
      return "int";
    else if (this == STR)
      return "String";
    else if (this == BOOL)
      return "boolean";
    else if (this == TERM)
      return "Term";
    else if (this == OBJ)
      return "Object";
    else if (this == FLOAT)
      return "double";
    else if (this == ACTOR)
      return "Actor";
    else return "void";
  }

  public String toArgString() {
    if (this == INT)
      return "Integer";
    else if (this == STR)
      return "String";
    else if (this == BOOL)
      return "Boolean";
    else if (this == FLOAT)
      return "Double";
    else return toString();
  }

  public boolean isSimple() {
    return this == STR || this == BOOL || this == INT;
  }

}
