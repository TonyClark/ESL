package ast.lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Return;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "pattern", "list", "body", "defaultValue" })

public class Find extends AST {

  public Pattern pattern;
  public AST     list;
  public AST     body;
  public AST     defaultValue;

  public Find() {
  }

  public Find(Pattern pattern, AST list, AST body, AST defaultValue) {
    this.pattern = pattern;
    this.list = list;
    this.body = body;
    this.defaultValue = defaultValue;
  }

  public String toString() {
    return "Find(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    desugar().compile(locals, dynamics, code);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, defaultValue);
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t")) }, new Apply(new Var("$find"), new Var("$t")));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PWild()) }, body);
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun("find", new String[] { "l" }, caseExp);
    return new Letrec(new Binding[] { new Binding("$find", fun) }, new Apply(new Var("$find"), list));
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
