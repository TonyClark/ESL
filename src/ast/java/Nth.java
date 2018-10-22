package ast.java;

import java.io.PrintWriter;

public class Nth extends Exp {

  Exp list;
  Exp index;

  public Nth(Exp list, Exp index) {
    this.list = list;
    this.index = index;
  }

  public void writeExp(PrintWriter out) {
    list.writeExp(out);
    out.print(".nth(");
    index.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
