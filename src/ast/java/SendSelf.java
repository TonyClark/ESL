package ast.java;

import java.io.PrintWriter;

public class SendSelf extends Exp {
  Exp arg;

  public SendSelf(Exp arg) {
    this.arg = arg;
  }

  public void writeExp(PrintWriter out) {
    out.print("self.send(");
    arg.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
