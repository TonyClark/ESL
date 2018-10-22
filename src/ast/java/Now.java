package ast.java;

import java.io.PrintWriter;

public class Now extends Exp {

  public void writeExp(PrintWriter out) {
    out.print("now()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
