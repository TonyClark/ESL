package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.patterns.PTerm;
import ast.patterns.Pattern;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "patterns", "guard", "exp" })

public class BArm {

  public Pattern[] patterns;

  public AST       guard;

  public AST       exp;

  public BArm() {
  }

  public BArm(Pattern[] patterns, AST guard, AST exp) {
    super();
    this.patterns = patterns;
    this.guard = guard;
    this.exp = exp;
  }

  public String[] args() {
    String[] args = new String[patterns.length + 1];
    for (int i = 0; i < patterns.length; i++)
      args[i] = "$" + i;
    args[patterns.length] = "$fail";
    return args;
  }

  private boolean binds(String name) {
    for (Pattern p : patterns)
      if (p.binds(name)) return true;
    return false;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox instrs, boolean isLast) {

    // Compile each of the patterns...

    for (int i = 0; i < patterns.length; i++)
      patterns[i].compile(locals, dynamics, new ast.refs.PatternValue(i), instrs);
    compileGuard(locals, dynamics, instrs);
    exp.compile(locals, dynamics, instrs, isLast);
  }

  private void compileGuard(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox instrs) {
    if (!isTrivialGuard()) {
      guard.compile(locals, dynamics, instrs, false);
      instrs.add(new instrs.patterns.FailFalse(guard.getLine()), locals, dynamics);
    }
  }

  public void DV(HashSet<String> vars) {

    // The dynamic vars in an arm are the dynamic vars in the guard and the expression
    // with the bound vars of the patterns removed...

    Vector<String> BV = new Vector<String>();
    for (Pattern p : patterns)
      p.bound(BV);
    HashSet<String> DV = new HashSet<String>();
    guard.DV(DV);
    exp.DV(DV);
    for (String b : BV)
      DV.remove(b);
    vars.addAll(DV);

  }

  public void FV(HashSet<String> vars) {

    // Free variables in an arm are the free variables in the guard and the expression
    // with the bound variables of the patterns removed...

    Vector<String> BV = new Vector<String>();
    for (Pattern p : patterns)
      p.bound(BV);
    HashSet<String> FV = new HashSet<String>();
    guard.FV(FV);
    exp.FV(FV);
    for (String b : BV)
      FV.remove(b);
    vars.addAll(FV);
  }

  private boolean isTimePattern() {
    if (patterns.length == 1) {
      if (patterns[0] instanceof PTerm) {
        PTerm p = (PTerm) patterns[0];
        return p.getName().equals("Time");
      }
      return false;
    }
    return false;
  }

  private boolean isTrivialGuard() {
    if (guard instanceof ast.data.Bool) {
      ast.data.Bool b = (ast.data.Bool) guard;
      return b.value;
    } else return false;
  }

  public int maxLocals() {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : patterns)
      p.vars(bound);

    // Only those that are not allocated as dynamic will wind up as local...

    HashSet<String> dynamic = new HashSet<String>();
    exp.DV(dynamic);
    bound.removeAll(dynamic);
    return bound.size();

  }

  public BArm subst(AST ast, String name) {

    // NB does not subst into the expressions embedded in patterns.
    // It should do that...

    if (binds(name))
      return this;
    else return new BArm(patterns, guard.subst(ast, name), exp.subst(ast, name));
  }

  public String toString() {
    return "BArm(" + Arrays.toString(patterns) + "," + exp + ")";
  }

  public void setPath(String path) {
    guard.setPath(path);
    exp.setPath(path);
  }

}
