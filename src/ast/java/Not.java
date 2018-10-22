package ast.java;

import java.io.PrintWriter;

public class Not extends Exp {

  Exp exp;

  public Not(Exp exp) {
    this.exp = exp;
  }

  public void writeExp(PrintWriter out) {
    out.print("(!(");
    exp.writeExp(out);
    out.print("))");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
}
