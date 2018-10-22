package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class PredList extends Exp {
  
  Exp pred;
  Exp exp;
  Type type;

  public PredList(Exp pred, Exp exp, Type type) {
    this.pred = pred;
    this.exp = exp;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    out.print("(");
    pred.writeExp(out);
    out.print(") ? new list.Nil<" + type.toArgString() + ">().cons(");
    exp.writeExp(out);
    out.print(") : new list.Nil<" + type.toArgString() + ">()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
