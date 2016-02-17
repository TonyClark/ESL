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

@BoaConstructor(fields = { "name", "list", "body" })

public class For extends AST {

  public String name;
  public AST    list;
  public AST    body;

  public For() {
  }

  public For(String name, AST list, AST body) {
    this.name = name;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "For(" + name + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    desugar().compile(locals, dynamics, code);;
  }

  public AST desugar() {
    BArm arm2 = new BArm(new Pattern[] { new PNil() }, new Block());
    BArm arm1 = new BArm(new Pattern[] { new PCons(new PVar(name), new PVar("$t")) }, new Block(body, new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2 });
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
