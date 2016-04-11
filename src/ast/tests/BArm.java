package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Let;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.lists.Head;
import ast.lists.Tail;
import ast.patterns.PTerm;
import ast.patterns.Pattern;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "patterns", "guard", "exp" })

public class BArm {

  public static AST And(AST m1, AST m2) {
    AST s = new Fun("and", new String[] { "$vals", "$fail" }, new Apply(m2, new Var("$vals"), new Var("$succ"), new Var("$fail")));
    return new Fun("and", new String[] { "$vals", "$succ", "$fail" }, new Apply(m1, new Var("$vals"), s, new Var("$fail")));
  }

  public static AST defaultMatcher() {
    return new Fun("default-matcher", new String[] { "$vals", "$succ", "$fail" }, new Apply(new Var("$succ"), new Var("$vals"), new Var("$fail")));
  }

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

  private AST bind(int i, Vector<String> vars, AST vals, AST exp) {
    if (i == vars.size())
      return exp;
    else return new Let(new Binding[] { new Binding(vars.get(i), new Head(vals)) }, bind(i + 1, vars, new Tail(vals), exp));
  }

  private boolean binds(String name) {
    for (Pattern p : patterns)
      if (p.binds(name)) return true;
    return false;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> instrs, boolean isLast) {

    // Compile each of the patterns...

    for (int i = 0; i < patterns.length; i++)
      patterns[i].compile(locals, dynamics, new ast.refs.PatternValue(i), instrs);
    compileGuard(locals, dynamics, instrs);
    exp.compile(locals, dynamics, instrs, isLast);
  }

  private void compileGuard(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> instrs) {
    if (!isTrivialGuard()) {
      guard.compile(locals, dynamics, instrs, false);
      instrs.add(new instrs.patterns.FailFalse());
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

}
