package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class SimpleFor extends Exp {

  String name;
  Type   type;
  Exp    list;
  Exp    body;

  public SimpleFor(String name, Type type, Exp list, Exp body) {
    this.name = name;
    this.type = type;
    this.list = list;
    this.body = body;
  }

  public void writeExp(PrintWriter out) {
    out.print("new java.util.function.Supplier<Object>() { public Object get() {");
    out.print("List<" + type.toArgString() + "> l_ = ");
    list.writeExp(out);
    out.print("; while(!l_.isNil()) { " + type.toString() + " " + name + " = l_.getHead();");
    out.print("l_ = l_.getTail();");
    body.writeCommand(out, false, false);
    out.print("}");
    out.print(" return null;}}.get()");
  }


  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
