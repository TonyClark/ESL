package ast.java;

import java.io.PrintWriter;

public class This extends Exp {
  
  String className;

  public This(String name) {
    className = name;
  }

  public void writeExp(PrintWriter out) {
    out.print("self");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
