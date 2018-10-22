package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Flatten extends Exp {
  
  Exp exp;
  Type type;

  public Flatten(Exp exp, Type type) {
    this.exp = exp;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    out.print("esl.Library.flatten(");
    exp.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
  
  public String toString() {
    return "Flatten(" + exp +"," + type + ")";
  }


}
