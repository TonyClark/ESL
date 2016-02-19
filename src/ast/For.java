package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Return;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class For extends AST {

  public Pattern pattern;
  public AST     list;
  public AST     body;

  public For() {
  }

  public For(Pattern pattern, AST list, AST body) {
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "For(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    desugar().compile(locals, dynamics, code);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, new Block());
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t")) }, new Apply(new Var("$f"), new Var("$t")));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t")) }, new Block(body, new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun("for", new String[] { "l" }, caseExp);
    return new Letrec(new Binding[] { new Binding("$f", fun) }, new Apply(new Var("$f"), list));
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public int maxLocals() {
    return desugar().maxLocals();
  }

}
