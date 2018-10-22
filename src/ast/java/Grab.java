package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Grab extends Exp {

  Lock[] locks;
  Exp    exp;
  Type   type;

  public Grab(Lock[] locks, Exp exp, Type type) {
    this.locks = locks;
    this.exp = exp;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    if (locks.length == 1)
      writeSingleLock(out);
    else writeMultipleLocks(out);
  }

  private void writeMultipleLocks(PrintWriter out) {
    out.print("lock(");
    out.print("new Fun0<" + type.toArgString() + ">() { public " + type.toArgString() + " apply() {");
    exp.writeCommand(out, true, true);
    out.print("}}");
    for (int i = 0; i < locks.length; i++) {
      out.print(",");
      locks[i].write(out);
    }
    out.print(")");
  }

  private void writeSingleLock(PrintWriter out) {
    out.print("new Fun0<" + type.toArgString() + ">() { public " + type.toArgString() + " apply() {");
    out.print("synchronized(");
    locks[0].write(out);
    out.println(") {");
    exp.writeCommand(out, true, true);
    out.print("}");
    out.print("}}.apply()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
