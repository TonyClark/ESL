package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Var;
import ast.data.Fun;
import ast.patterns.Pattern;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "patterns", "exp" })

public class BArm {

  public Pattern[] patterns;
  public AST       exp;

  public BArm() {
  }

  public BArm(Pattern[] patterns, AST exp) {
    super();
    this.patterns = patterns;
    this.exp = exp;
  }

  public String toString() {
    return "BArm(" + Arrays.toString(patterns) + "," + exp + ")";
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
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

  public void DV(HashSet<String> vars) {
    desugar().DV(vars);
  }

  public AST desugar() {
    return new Fun("", args(), desugarCondition(0));
  }

  private AST desugarCondition(int i) {
    if (i == patterns.length)
      return exp;
    else return patterns[i].desugar(new Var("$" + i), desugarCondition(i + 1), new Var("$fail"));
  }

  public String[] args() {
    String[] args = new String[patterns.length + 1];
    for (int i = 0; i < patterns.length; i++)
      args[i] = "$" + i;
    args[patterns.length] = "$fail";
    return args;
  }

  public BArm subst(AST ast, String name) {

    // NB does not subst into the expressions embedded in patterns.
    // It should do that...

    System.out.println("barm " + binds(name));
    if (binds(name))
      return this;
    else return new BArm(patterns, exp.subst(ast, name));
  }

  private boolean binds(String name) {
    for (Pattern p : patterns)
      if (p.binds(name)) return true;
    return false;
  }

}
