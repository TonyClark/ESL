package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Dot extends Exp {

  Exp    exp;
  String name;
  Type   type;

  public Dot(Type type, Exp exp, String name) {
    this.type = type;
    this.exp = exp;
    this.name = name;
  }

  public void writeExp(PrintWriter out) {
    out.print("((" + type.toString() + ")");
    exp.writeExp(out);
    out.print(".get(\"" + name + "\"))");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
