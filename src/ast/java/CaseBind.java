package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;
import ast.patterns.PVar;

public class CaseBind extends CaseArm {

  PVar    var;
  Type    type;
  Type    result;
  Exp     exp;
  CaseArm cont;

  public CaseBind(PVar var, Type type, Type result, Exp exp, CaseArm cont) {
    this.var = var;
    this.type = type;
    this.result = result;
    this.exp = exp;
    this.cont = cont;
  }

  public void write(PrintWriter out) {
    out.print("new Fun1<" + result.toArgString() + "," + "Fail<" + result.toArgString() + ">>() { public " + result.toArgString() + " apply(");
    out.print("Fail<" + result.toArgString() + "> fail) {");
    out.print(type.toString() + " " + var.getName() + "=");
    exp.writeExp(out);
    out.print(";");
    out.print("return ");
    cont.write(out);
    out.print(".apply(fail);");
    out.print("}}");
  }

  public void toMessageHandler() {
    result = Type.OBJ;
    cont.toMessageHandler();
  }

  public String toString() {
    return "CaseBind(" + var + "," + type + "," + result + "," + exp + "," + cont + ")";
  }

}
