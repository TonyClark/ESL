package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.par.ParCompete;
import ast.query.instrs.par.ParStart;
import ast.query.instrs.par.ParWin;
import ast.types.Type;
import exp.BoaConstructor;

@BoaConstructor(fields = { "goal1", "goal2" })
public class Par extends BodyElement {

  public BodyElement[] goal1;
  public BodyElement[] goal2;

  public Par() {
  }

  public Par(int lineStart, int lineEnd, BodyElement[] goal1, BodyElement[] goal2) {
    super(lineStart, lineEnd);
    this.goal1 = goal1;
    this.goal2 = goal2;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newGoal1 = new BodyElement[goal1.length];
    BodyElement[] newGoal2 = new BodyElement[goal2.length];
    for (int i = 0; i < goal1.length; i++) {
      newGoal1[i] = goal1[i].subst(type, typeName);
    }
    for (int i = 0; i < goal2.length; i++) {
      newGoal2[i] = goal2[i].subst(type, typeName);
    }
    return new Par(getLineStart(), getLineEnd(), newGoal1, newGoal2);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement e : goal1)
      e.getContainedDecs(decs);
    for (BodyElement e : goal2)
      e.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast) {
    code.add(new ParStart());
    for (BodyElement e : goal1) {
      e.compile(code, length, vars, false);
    }
    code.add(new ParCompete());

    for (BodyElement e : goal2) {
      e.compile(code, length, vars, false);
    }
    code.addElement(new ParWin());
  }

  public void vars(HashSet<String> vars) {
    vars(goal1, vars);
    vars(goal2, vars);
  }

}
