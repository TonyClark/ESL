package ast.java;

import java.io.PrintWriter;

public class Become extends Exp {
  
  Exp exp;

  public Become(Exp exp) {
    this.exp = exp;
  }

  public void writeExp(PrintWriter out) {
    out.print("self.become(");
    exp.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
