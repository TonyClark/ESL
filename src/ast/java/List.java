package ast.java;

import java.io.PrintWriter;
import java.util.Arrays;

import ast.java.types.Type;

public class List extends Exp {

  Type  type;
  Exp[] exps;

  public List(Type type, Exp[] exps) {
    super();
    this.type = type;
    this.exps = exps;
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public void writeExpOriginal(PrintWriter out) {
    out.print("list.List.asList(new " + type.toArgString() + "[]{");
    for (int i = 0; i < exps.length; i++) {
      exps[i].writeExp(out);
      if (i + 1 < exps.length) out.print(",");
    }
    out.print("})");
  }

  public void writeExp(PrintWriter out) {
    out.println("new list.Nil()");
    for(int i = exps.length-1;i>=0;i--) {
      out.print(".cons(");
      exps[i].writeExp(out);
      out.print(")");
    }
  }
  
  public String toString() {
    return "List(" + Arrays.toString(exps) + ")";
  }

}
