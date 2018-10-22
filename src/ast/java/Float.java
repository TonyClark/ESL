package ast.java;

import java.io.PrintWriter;

public class Float extends Exp {
  
  double value;

  public Float(double value) {
    super();
    this.value = value;
  }
  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public void writeExp(PrintWriter out) {
    out.print(value);
  }

}
