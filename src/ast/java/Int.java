package ast.java;

import java.io.PrintWriter;

public class Int extends Exp {

  int value;

  public Int(int value) {
    this.value = value;
  }

  public void writeExp(PrintWriter out) {
    out.print(value);
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public String toString() {
    return "Int(" + value + ")";
  }

}
