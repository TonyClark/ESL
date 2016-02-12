package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

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
    return new Fun("",new String[] {"$v","$fail"},new Apply(left,new Var("$v"),new Fun("",new String[] {},new Apply(right,new Var("$v"),new Var("$fail")))));
  }

  private AST[] desugarArgs() {
    AST[] args = new AST[exps.length + 1];
    for (int i = 0; i < exps.length; i++)
      args[i] = exps[i];
    args[exps.length] = new Fun("", new String[] {}, new ast.Error(new Str("ran out of case arms")));
    return args;
  }

  public void FV(HashSet<String> vars) {
    for (AST e : exps)
      e.FV(vars);
    for (BArm b : arms)
      b.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    DV(exps, vars);
    for (BArm arm : arms)
      arm.DV(vars);
  }

  public int maxLocals() {
    return Math.max(maxLocals(exps), maxLocals(arms));
  }

}
