package ast.java;

import java.io.PrintWriter;

public class To extends Exp {
  
  Exp low;
  Exp high;

  public To(Exp low, Exp high) {
    this.low = low;
    this.high = high;
  }

  public void writeExp(PrintWriter out) {
    out.print("esl.Library.to(");
    low.writeExp(out);
    out.print(",");
    high.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
  
  public String toString() {
    return "To(" + low + "," + high + ")";
  }


}
