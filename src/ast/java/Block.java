package ast.java;

import java.io.PrintWriter;
import java.util.Arrays;

import ast.java.types.Type;

public class Block extends Exp {

  Exp[] exps;
  Type  type;

  public Block(Exp[] exps, Type type) {
    this.exps = exps;
    this.type = type;
  }

  public void writeExp(PrintWriter out) {
    if (exps.length == 0) {
      out.println("null");
    } else if (exps.length == 1) {
      exps[0].writeExp(out);
    } else writeExps(out, 0);
  }

  private void writeExps(PrintWriter out, int i) {
    if (i + 1 == exps.length) {
      exps[i].writeExp(out);
    } else {
      out.print("new Fun0<" + type.toArgString() + ">() {");
      out.print("public " + type.toArgString() + " apply() { Object ignore = ");
      exps[i].writeExp(out);
      out.print("; return ");
      writeExps(out, i + 1);
      out.print(";}}.apply()");
    }

  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (exps.length == 0) {
      if (isLast && returnValue)
        out.print("return null;");
      else out.print("{}");
    } else if (exps.length == 1)
      exps[0].writeCommand(out, isLast, returnValue);
    else {
      for (int i = 0; i < exps.length - 1; i++)
        exps[i].writeCommand(out, false, false);
      exps[exps.length - 1].writeCommand(out, true, returnValue);
    }
  }

  public String toString() {
    return "Block(" + Arrays.toString(exps) + "," + type + ")";
  }

}
