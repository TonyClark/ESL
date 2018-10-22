package ast.java;

import java.io.PrintWriter;

public class If extends Exp {

  Exp test;
  Exp conseq;
  Exp alt;

  public If(Exp test, Exp conseq, Exp alt) {
    super();
    this.test = test;
    this.conseq = conseq;
    this.alt = alt;
  }

  public void writeExp(PrintWriter out) {
    out.print("(");
    test.writeExp(out);
    out.print(")");
    out.print(" ? ");
    conseq.writeExp(out);
    out.print(" : ");
    alt.writeExp(out);
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    out.print("if(");
    test.writeExp(out);
    out.print(") {");
    conseq.writeCommand(out, isLast, returnValue);
    out.print("} else {");
    alt.writeCommand(out, isLast, returnValue);
    out.print("}");
  }

  public String toString() {
    return "If(" + test + "," + conseq + "," + alt + ")";
  }

}
