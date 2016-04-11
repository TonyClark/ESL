package ast.lists;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Bool;
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

  static int     mapCount = 0;

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

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    desugar().compile(locals, dynamics, code, isLast);
  }

  public AST desugar() {
    BArm arm2 = new BArm(new Pattern[] { new PNil() }, Bool.TRUE, new ast.lists.List());
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t")) }, Bool.TRUE, new BinExp(body, ":", new Apply(new Var("$f"), new Var("$t"))));
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2 });
    Fun fun = new Fun(mapName(), new String[] { "l" }, caseExp);
    return new Letrec(new Binding[] { new Binding("$f", fun) }, new Apply(new Var("$f"), list));
  }

  private String mapName() {
    return "map" + (mapCount++);
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

  public AST subst(AST ast, String name) {
    return desugar().subst(ast, name);
  }

}
