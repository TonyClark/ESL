package ast.java;

import java.io.PrintWriter;

public class Throw extends Exp {

  Exp exp;

  public Throw(Exp exp) {
    this.exp = exp;
  }

  public void writeExp(PrintWriter out) {
    out.print("esl.Library.throwError(");
    exp.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
}
