package ast.java;

import java.io.PrintWriter;

public class Term extends Exp {
  
  String name;
  Exp[] args;
  
  public Term(String name, Exp[] args) {
    super();
    this.name = name;
    this.args = args;
  }


  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }


  public void writeExp(PrintWriter out) {
    out.print("new Term(\"" + name + "\"");
    for(int i = 0; i < args.length;i++) {
      out.print(",");
      args[i].writeExp(out);
    }
    out.print(")");
  }

}
