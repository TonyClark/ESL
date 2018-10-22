package ast.java;

import java.io.PrintWriter;

public class ApplyBuiltin extends Exp {

  String name;
  Exp[]  args;

  public ApplyBuiltin(String name, Exp[] args) {
    this.name = name;
    this.args = args;
  }

  public void writeExp(PrintWriter out) {
    out.print(name + "(");
    for (int i = 0; i < args.length; i++) {
      args[i].writeExp(out);
      if (i + 1 < args.length) {
        out.print(",");
      }
    }
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
