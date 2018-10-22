package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class RecDec extends Dec {

  public RecDec(Type type, String name, Exp exp) {
    super(type, name, exp);
    modified = true;
  }

  public void write(PrintWriter out) {
    out.print("Cell<");
    out.print(type.toArgString());
    out.print(">");
    out.print(" " + name + " = new Cell<" + type.toArgString() + ">(null); " + name + ".setValue(");
    exp.writeExp(out);
    out.print(");");
  }

}
