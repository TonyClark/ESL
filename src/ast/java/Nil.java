package ast.java;

import java.io.PrintWriter;

public class Nil extends Exp {
  
  public static Nil NIL = new Nil();

  public void writeExp(PrintWriter out) {
    out.print("new list.Nil()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
  
  public String toString() {
    return "Nil()";
  }

}
