package ast.java;

import java.io.PrintWriter;

public class Builtin extends Exp {

  String name;

  public Builtin(String name) {
    this.name = name;
  }

  public void writeExp(PrintWriter out) {
    out.println("builtin(\"" + name + "\")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
