package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class ConsHead extends Exp {

  Exp  exp;
  Type type;

  public ConsHead(Exp exp, Type type) {
    this.exp = exp;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    out.print("consHead(");
    exp.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }


}
