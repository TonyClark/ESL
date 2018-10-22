package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Dec {

  Type    type;
  String  name;
  boolean modified = false;
  Exp     exp;

  public Dec(Type type, String name, Exp exp) {
    super();
    this.type = type;
    this.name = name;
    this.exp = exp;
  }

  public void write(PrintWriter out) {
    if (modified) {
      out.print("Cell<");
      out.print(type.toArgString());
      out.print(">");
    } else out.print(type.toString());
    out.print(" " + name + " = ");
    if (modified) {
      out.print("new Cell<");
      out.print(type.toArgString());
      out.print(">(");
      exp.writeExp(out);
      out.print(")");
    } else exp.writeExp(out);
    out.print(";");
  }

  public Type getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Exp getExp() {
    return exp;
  }

  public String toString() {
    return "Dec(" + type + "," + name + "," + modified + "," + exp + ")";
  }

  public boolean isModified() {
    return modified;
  }

  public void setModified(boolean modified) {
    this.modified = modified;
  }

  public void writeTopLevel(PrintWriter out, boolean isExported) {
    if (isExported) {
      out.print("public static ");
      write(out);
    } else {
      out.print("private static ");
      write(out);
    }
  }


  public void writeCell(PrintWriter out) {
    out.print("Cell<");
    out.print(type.toArgString());
    out.print(">");
    out.print(" " + name + " = new Cell<" + type.toArgString() + ">(null);");
  }

	public void setValue(PrintWriter out) {
    out.print(name + ".setValue(");
    exp.writeExp(out);
    out.print(");");
	}

}
