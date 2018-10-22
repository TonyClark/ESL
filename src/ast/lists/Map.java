package ast.lists;

import java.util.HashSet;

import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.general.AST;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class Map extends AST {

  static int     mapCount = 0;

  String         path;
  public Pattern pattern;
  public AST     list;
  public AST     body;

  public Map() {
  }

  public Map(int lineStart, int lineEnd, String path, Pattern pattern, AST list, AST body) {
    super(lineStart, lineEnd);
    this.path = path;
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "Map(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    desugar().compile(locals, dynamics, code, isLast);
  }

  public AST desugar() {
    BArm arm2 = new BArm(new Pattern[] { new PNil() }, Bool.TRUE, new ast.lists.List(), false);
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t", new ast.types.Void())) }, Bool.TRUE, new BinExp(getLineStart(), getLineEnd(), body, ":", new Apply(getLineStart(), getLineEnd(), "", new Var(getLineStart(), getLineEnd(), "$f", null, null), new Var(getLineStart(), getLineEnd(), "$t", null, null))), false);
    Case caseExp = new Case(getLineStart(), getLineEnd(), new Dec[] {}, new AST[] { new Var(getLineStart(), getLineEnd(), "l", null, null) }, new BArm[] { arm1, arm2 });
    Fun fun = new Fun(getLineStart(), getLineEnd(), path, mapName(), new Dec[] { new Dec(getLineStart(), getLineEnd(), path, "l", ast.types.Void.VOID, ast.types.Void.VOID) }, ast.types.Void.VOID, caseExp, false);
    return new Letrec(getLineStart(), getLineEnd(), new Binding[] { new Binding(getLineStart(), getLineEnd(), path, "$f", new ast.types.Void(), new ast.types.Void(), fun) }, new Apply(getLineStart(), getLineEnd(), "", new Var(getLineStart(), getLineEnd(), "$f", null, null), list));
  }

  private AST mapName() {
    return new Str("map" + (mapCount++));
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
  }

  public Type type(Env<String, Type> env) {
    Type type = body.type(env);
    setType(new ast.types.List(getLineStart(), getLineEnd(), type));
    return getType();
  }

  public String getLabel() {
    return "map :: " + getType();
  }

}
