package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class TermRef extends Exp {

  Exp  exp;
  Type type;
  int  index;

  public TermRef(Exp exp, Type type, int index) {
    this.exp = exp;
    this.type = type;
    this.index = index;
  }

  public void writeExp(PrintWriter out) {
    out.print("termRef(");
    exp.writeExp(out);
    out.print("," + index + ")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }


}
