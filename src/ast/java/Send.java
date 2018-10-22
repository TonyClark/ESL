package ast.java;

import java.io.PrintWriter;

public class Send extends Exp {
  
  Exp target;
  Exp arg;

  public Send(Exp target, Exp arg) {
    this.target = target;
    this.arg = arg;
  }

  public void writeExp(PrintWriter out) {
    target.writeExp(out);
    out.print(".send(");
    arg.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
