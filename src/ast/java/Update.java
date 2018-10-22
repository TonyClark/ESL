package ast.java;

import java.io.PrintWriter;

public class Update extends Exp {

  String name;
  Exp    exp;
  
  public Update(String name, Exp exp) {
    super();
    this.name = name;
    this.exp = exp;
  }

  public void writeExp(PrintWriter out) {
    out.print(name);
    out.print(".setValue(");
    exp.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
