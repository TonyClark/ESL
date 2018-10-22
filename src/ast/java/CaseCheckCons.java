package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;
import ast.patterns.PCons;

public class CaseCheckCons extends CaseArm {

  PCons   cons;
  Exp     exp;
  Type    type;
  CaseArm cont;

  public CaseCheckCons(PCons cons, Exp exp, Type type, CaseArm cont) {
    this.cons = cons;
    this.exp = exp;
    this.type = type;
    this.cont = cont;
  }

  public void write(PrintWriter out) {
    out.print("new Fun1<" + type.toArgString() + "," + "Fail<" + type.toArgString() + ">>() { public " + type.toArgString() + " apply(");
    out.print("Fail<" + type.toArgString() + "> fail) {");

    out.print("if(isCons(");
    exp.writeExp(out);
    out.print("))");

    out.print("return ");
    cont.write(out);
    out.print(".apply(fail);");

    out.print("else return fail.fail();");
    out.print("}}");
  }

  public void toMessageHandler() {
    type = Type.OBJ;
    cont.toMessageHandler();
  }
}
