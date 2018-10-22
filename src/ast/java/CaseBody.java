package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class CaseBody extends CaseArm {

  Exp  guard;
  Exp  body;
  Type type;

  public CaseBody(Exp guard, Exp body, Type type) {
    this.guard = guard;
    this.body = body;
    this.type = type;
  }

  public void write(PrintWriter out) {
    out.print("new Fun1<" + type.toArgString() + "," + "Fail<" + type.toArgString() + ">>() { public " + type.toArgString() + " apply(");
    out.print("Fail<" + type.toArgString() + "> fail) {");
    writeCheck(out);
    out.print("}}");
  }

  private void writeCheck(PrintWriter out) {
    if (isTrueGuard()) {
      out.print("return ");
      body.writeExp(out);
      out.print(";");
    } else {
      out.print("if(");
      guard.writeExp(out);
      out.print(") {");
      out.print("return ");
      body.writeExp(out);
      out.print(";");
      out.print("} else return fail.fail();");
    }
  }

  private boolean isTrueGuard() {
    if (guard instanceof Bool) {
      Bool b = (Bool) guard;
      return b.value;
    } else return false;
  }

  public void toMessageHandler() {
    type = Type.OBJ;
  }

  public String toString() {
    return "CaseBody(" + body + "," + type + ")";
  }

}
