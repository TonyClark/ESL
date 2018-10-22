package ast.java;

import java.io.PrintWriter;
import java.util.Arrays;

import ast.java.types.Type;

public class Case extends Exp {

  Dec[]     decs;
  CaseArm[] arms;
  Type      type;

  public Case(Dec[] decs, CaseArm[] arms, Type type) {
    this.decs = decs;
    this.arms = arms;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    // Turn into the application of a function that returns a function expecting
    // a fail continuation...
    out.print("new Fun" + decs.length + "<");
    out.print(type.toArgString());
    for (int i = 0; i < decs.length; i++) {
      out.print("," + decs[i].getType().toArgString());
    }
    out.print("> () {");
    out.print("public " + type.toArgString() + " apply(");
    for (int i = 0; i < decs.length; i++) {
      out.print(decs[i].getType().toArgString() + " " + decs[i].getName());
      if (i + 1 < decs.length) out.print(",");
    }
    out.print(") { return ");
    writeArms(out, 0);
    out.print(".fail(); } }.apply(");
    for (int i = 0; i < decs.length; i++) {
      decs[i].getExp().writeExp(out);
      if (i + 1 < decs.length) out.print(",");
    }
    out.print(")");
  }

  private void writeArms(PrintWriter out, int i) {
    if (i == arms.length)
      out.print("new Fail<" + type.toArgString() + ">() { public " + type.toArgString() + " fail() { throw new Error(\" case failed.\"); } }");
    else {
      out.println("new Fail<" + type.toArgString() + ">() { public " + type.toArgString() + " fail() { return ");
      arms[i].write(out);
      out.print(".apply(");
      writeArms(out, i + 1);
      out.print("); } }");
    }
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public void toMessageHandler() {
    // Ensure all the return types are Object...
    type = Type.OBJ;
    for (CaseArm arm : arms) {
      arm.toMessageHandler();
    }
  }
  
  public String toString() {
    return "Case(" + Arrays.toString(arms) + ")";
  }

}
