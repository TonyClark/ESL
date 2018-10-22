package ast.java;

import java.io.PrintWriter;

public class Str extends Exp {

  String value;

  public Str(String value) {
    this.value = value;
  }

  public void writeExp(PrintWriter out) {
    out.print("\"" + value + "\"");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
