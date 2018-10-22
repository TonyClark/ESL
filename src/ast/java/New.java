package ast.java;

import java.io.PrintWriter;

public class New extends Exp {

  Exp   op;
  Exp[] args;

  public New(Exp op, Exp[] args) {
    this.op = op;
    this.args = args;
  }

  public void writeExp(PrintWriter out) {
    op.writeExp(out);
    out.println("apply(");
    for (int i = 0; i < args.length; i++) {
      args[i].writeExp(out);
      if (i + 1 < args.length) out.println(",");
    }
    out.println(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
