package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;
import ast.patterns.Pattern;

public class For extends Exp {
  
  String name;
  Pattern pattern;
  Exp list;
  Type type;
  Exp body;

  public For(String name, Pattern pattern, Exp list, Type type, Exp body) {
    this.name = name;
    this.pattern = pattern;
    this.list = list;
    this.type = type;
    this.body = body;
  }

  public void writeExp(PrintWriter out) {
    out.print("forList(");
    list.writeExp(out);
    out.print(",new Fun1<Object," + type.toArgString() + ">() { public Object apply(" + type.toArgString() + " " + name + ") { ");
    body.writeCommand(out,true,true);
    out.print("}})");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
