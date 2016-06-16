package ast.lists;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Bool;
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
import list.List;

@BoaConstructor(fields = { "pattern", "list", "body", "defaultValue" })

public class Find extends AST {

  static int     findCount = 0;

  public String  path;
  public Pattern pattern;
  public AST     list;
  public AST     body;
  public AST     defaultValue;

  public Find() {
  }

  public Find(String path, Pattern pattern, AST list, AST body, AST defaultValue) {
    this.path = path;
    this.pattern = pattern;
    this.list = list;
    this.body = body;
    this.defaultValue = defaultValue;
  }

  public String toString() {
    return "Find(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    desugar().compile(locals, dynamics, code, isLast);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, Bool.TRUE, defaultValue);
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t")) }, Bool.TRUE, new Apply(new Var("$find"), new Var("$t")));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PWild()) }, Bool.TRUE, body);
    Case caseExp = new Case(new AST[] { new Var("l") }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun(path, findName(), new String[] { "l" }, caseExp);
    return new Letrec(getLine(),new Binding[] { new Binding(path, "$find", fun) }, new Apply(new Var("$find"), list));
  }

  private String findName() {
    return "find" + (findCount++);
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

  public void setPath(String path) {
    this.path = path;
    list.setPath(path);
    body.setPath(path);
    defaultValue.setPath(path);
  }

}
