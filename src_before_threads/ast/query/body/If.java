package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.control.Goto;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "test", "conseq", "alt" })
public class If extends BodyElement {

  public BodyElement[] test;
  public BodyElement[] conseq;
  public BodyElement[] alt;

  public If() {
  }

  public If(int lineStart, int lineEnd, BodyElement[] test, BodyElement[] conseq, BodyElement[] alt) {
    super(lineStart, lineEnd);
    this.test = test;
    this.conseq = conseq;
    this.alt = alt;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newTest = new BodyElement[test.length];
    BodyElement[] newConseq = new BodyElement[conseq.length];
    BodyElement[] newAlt = new BodyElement[alt.length];
    for (int i = 0; i < test.length; i++) {
      newTest[i] = test[i].subst(type, typeName);
    }
    for (int i = 0; i < conseq.length; i++) {
      newConseq[i] = conseq[i].subst(type, typeName);
    }
    for (int i = 0; i < alt.length; i++) {
      newAlt[i] = alt[i].subst(type, typeName);
    }
    return new If(getLineStart(), getLineEnd(), newTest, newConseq, newAlt);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement e : test)
      e.getContainedDecs(decs);
    for (BodyElement e : conseq)
      e.getContainedDecs(decs);
    for (BodyElement e : alt)
      e.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast) {
    ast.query.instrs.control.If cond = new ast.query.instrs.control.If(0);
    code.add(cond);
    for (BodyElement e : test)
      e.compile(code, length, vars, false);
    code.add(new ast.query.instrs.control.Cut());
    for(BodyElement e : conseq)
      e.compile(code, length, vars, false);
    Goto go = new Goto(0);
    code.add(go);
    cond.setOffset(code.size());
    for(BodyElement e : alt)
      e.compile(code, length, vars, isLast);
    go.setOffset(code.size());
  }

  public void vars(HashSet<String> vars) {
    vars(test, vars);
    vars(conseq, vars);
    vars(alt, vars);
  }

}
