package ast.java;

import java.io.PrintWriter;

public class TimeHandler {

  String name;
  Exp    exp;

  public TimeHandler(String name, Exp exp) {
    this.name = name;
    this.exp = exp;
  }

  public void write(PrintWriter out) {
    out.print("public void processTime(Actor self,int " + name + ") {");
    exp.writeCommand(out, true, false);
    out.print("}");
  }

}
