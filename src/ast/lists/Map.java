package ast.lists;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Fun;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class Map extends AST {

  public Pattern pattern;
  public AST     list;
  public AST     body;

  public Map() {
  }

  public Map(Pattern pattern, AST list, AST body) {
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "Map(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    desugar().compile(locals, dynamics, code);
  }

  public AST desugar() {
    BArm arm2 = new BArm(new Pattern[] { new PNil() }, new ast.lists.List());
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t")) }, new BinExp(body, ":", new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2 });
    Fun fun = new Fun("map", new String[] { "l" }, caseExp);
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
