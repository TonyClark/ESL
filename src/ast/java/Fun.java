package ast.java;

import java.io.PrintWriter;
import java.util.Arrays;

import ast.java.types.Type;

public class Fun extends Exp {

  Dec[] args;
  Type  range;
  Exp   body;

  public Fun(Dec[] args, Type range, Exp body) {
    super();
    this.args = args;
    this.range = range;
    this.body = body;
  }

  public void writeExp(PrintWriter out) {
    out.print("new Fun" + args.length + "<" + range.toArgString());
    for (int i = 0; i < args.length; i++) {
      out.print("," + args[i].getType().toArgString());
    }
    out.print("> () { public " + range.toArgString() + " apply(");
    for (int i = 0; i < args.length; i++) {
      Dec arg = args[i];
      String argName = arg.isModified() ? arg.getName() + "_" : arg.getName();
      out.println(arg.getType().toArgString() + " " + argName);
      if (i + 1 < args.length) out.print(",");
    }
    out.print(") {");
    for (int i = 0; i < args.length; i++) {
      Dec arg = args[i];
      if(arg.isModified()) {
        out.print("Cell<" + arg.getType().toArgString() +"> " + arg.getName() + " = new Cell<" + arg.getType().toArgString() + ">(" + arg.getName() + "_);");
      }
    }
    body.writeCommand(out, true, true);
    out.print("}}");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public String toString() {
    return "Fun(" + Arrays.toString(args) + "," + range + "," + body + ")";
  }

}
