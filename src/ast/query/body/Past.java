package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.temporal.PastFact;
import ast.query.instrs.temporal.PastFact1;
import ast.query.instrs.temporal.ResetTime;
import ast.types.Type;
import exp.BoaConstructor;

@BoaConstructor(fields = { "elements" })
public class Past extends BodyElement {

  public BodyElement[] elements;

  public Past() {
  }

  public Past(int lineStart, int lineEnd, BodyElement[] elements) {
    super(lineStart, lineEnd);
    this.elements = elements;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newElements = new BodyElement[elements.length];
    for (int i = 0; i < elements.length; i++) {
      newElements[i] = elements[i].subst(type, typeName);
    }
    return new Past(getLineStart(), getLineEnd(), newElements);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement e : elements)
      e.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {

    // Saves a time counter and the current code pointer in a special type of
    // fail frame. Uses a local to save the current time so that it is reset when
    // the eventually body succeeds...

    if (isPastFact())
      compilePastFact(code, arity, vars, isLast);
    else if (isPastFact1())
      compilePastFact1(code, arity, vars, isLast);
    else compilePast(code, arity, vars, isLast);
  }

  private void compilePastFact(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    Call call = (Call) elements[0];
    call.getArgs()[0].compile(code, arity, vars);
    code.add(new PastFact());
  }

  private void compilePastFact1(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    Call call = (Call) elements[0];
    call.getArgs()[0].compile(code, arity, vars);
    code.add(new PastFact1());
  }

  private boolean isPastFact() {
    if (elements.length == 1) {
      BodyElement element = elements[0];
      if (element instanceof Call) {
        Call call = (Call) element;
        return call.getName().equals("fact") && call.getArity() == 1;
      } else return false;
    } else return false;
  }

  private boolean isPastFact1() {
    if (elements.length == 2) {
      BodyElement element = elements[0];
      if (element instanceof Call) {
        Call call = (Call) element;
        return call.getName().equals("fact") && call.getArity() == 1 && elements[1] instanceof Cut;
      } else return false;
    } else return false;
  }

  public void compilePast(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {

    // Saves a time counter and the current code pointer in a special type of
    // fail frame. Uses a local to save the current time so that it is reset when
    // the eventually body succeeds...

    String time = "time" + Math.random();
    vars.add(time);
    code.add(new ast.query.instrs.temporal.Past(vars.indexOf(time) + arity));
    for (BodyElement e : elements)
      e.compile(code, arity, vars, false);
    code.add(new ResetTime(vars.indexOf(time) + arity));
  }

  public void vars(HashSet<String> vars) {
    vars(elements, vars);
  }

}
