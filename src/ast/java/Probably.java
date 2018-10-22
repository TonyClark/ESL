package ast.java;

import java.io.PrintWriter;

public class Probably extends Exp {
  
  Exp value;
  Exp body;
  Exp alt;

  public Probably(Exp value, Exp body, Exp alt) {
    this.value = value;
    this.body = body;
    this.alt = alt;
  }

  public void writeExp(PrintWriter out) {
    out.println("(esl.Library.probably(");
    value.writeExp(out);
    out.print(") ? (");
    body.writeExp(out);
    out.print(") : (");
    alt.writeExp(out);
    out.print("))");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }


}
