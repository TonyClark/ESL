package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class NewJava extends Exp {

  String className;
  Type   type;
  Exp[]  args;

  public NewJava(String className, Type type, Exp[] args) {
    this.className = className;
    this.type = type;
    this.args = args;
  }

  public void writeExp(PrintWriter out) {
    out.print("javaNew(\"" + className + "\"");
    for (Exp exp : args) {
      out.print(",");
      exp.writeExp(out);
    }
    out.print(")");

  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
