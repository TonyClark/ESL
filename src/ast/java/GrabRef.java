package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class GrabRef extends Exp {

  Exp    actor;
  String name;
  Type   type;
  Exp    body;

  public GrabRef(Exp actor, String name, Type type, Exp body) {
    this.actor = actor;
    this.name = name;
    this.type = type;
    this.body = body;
  }

  public void writeExp(PrintWriter out) {
    out.print("new Fun0<" + type.toArgString() + ">() { public " + type.toArgString() + " apply() {");
    out.print("synchronized(");
    actor.writeExp(out);
    out.print(".get(\"" + name + "\")){");
    body.writeCommand(out, true, true);
    out.print("}");
    out.print("}}.apply()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
