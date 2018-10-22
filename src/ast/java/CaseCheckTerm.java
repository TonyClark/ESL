package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;
import ast.patterns.PTerm;

public class CaseCheckTerm extends CaseArm {

  PTerm   term;
  Exp     exp;
  Type    type;
  CaseArm cont;

  public CaseCheckTerm(PTerm term, Exp exp, Type type, CaseArm cont) {
    this.term = term;
    this.exp = exp;
    this.type = type;
    this.cont = cont;
  }

  public void write(PrintWriter out) {
    out.print("new Fun1<" + type.toArgString() + "," + "Fail<" + type.toArgString() + ">>() { public " + type.toArgString() + " apply(");
    out.print("Fail<" + type.toArgString() + "> fail) {");

    out.print("if(isTerm(");
    exp.writeExp(out);
    out.print(",\"" + term.getName() + "\"," + term.getPatterns().length + "))");

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
