package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Var;
import ast.control.Error;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Fun;
import ast.data.Str;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "exps", "arms" })

public class Case extends AST {

  public AST[]  exps;
  public BArm[] arms;

  public Case() {
  }

  public Case(AST[] exps, BArm[] arms) {
    super();
    this.exps = exps;
    this.arms = arms;
  }

  public String toString() {
    return "Case(" + Arrays.toString(exps) + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    desugar().compile(locals, dynamics, code);
  }

  public AST desugar() {
    return new Apply(desugarArms(0), desugarArgs());
  }

  private AST desugarArms(int i) {
    if (i + 1 == arms.length)
      return arms[i].desugar();
    else return combineOr(arms[i].desugar(), desugarArms(i + 1));
  }

  private AST combineOr(AST left, AST right) {
    return new Fun("", new String[] { "$v", "$fail" }, new Apply(left, new Var("$v"), new Fun("", new String[] {}, new Apply(right, new Var("$v"), new Var("$fail")))));
  }

  private AST[] desugarArgs() {
    AST[] args = new AST[exps.length + 1];
    for (int i = 0; i < exps.length; i++)
      args[i] = exps[i];
    args[exps.length] = new Fun("", new String[] {}, new ast.control.Error(new BinExp(new Str("ran out of case arms for: "), "+", new ast.lists.List(exps))));
    return args;
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    desugar().DV(vars);
  }

  public int maxLocals() {
    return desugar().maxLocals();
  }

}
