package ast.java;

import java.io.PrintWriter;

public class Apply extends Exp {

  Exp   op;
  Exp[] args;

  public Apply(Exp op, Exp[] args) {
    super();
    this.op = op;
    this.args = args;
  }

  public void writeExp(PrintWriter out) {
    writeOp(out);
    out.print(".apply(");
    for (int i = 0; i < args.length; i++) {
      args[i].writeExp(out);
      if (i + 1 < args.length) out.print(",");
    }
    out.print(")");
  }

  private void writeOp(PrintWriter out) {
    if (op instanceof Var) {
      Var var = (Var) op;
      var.writeRef(out);
    } else op.writeExp(out);
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
