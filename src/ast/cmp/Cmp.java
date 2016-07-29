package ast.cmp;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "exp", "qualifiers" })

public class Cmp extends AST {

  public AST         exp;
  public Qualifier[] qualifiers;

  public Cmp() {
  }

  public String toString() {
    return "Cmp(" + exp + "," + Arrays.toString(qualifiers) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> types, CodeBox code, boolean isLast) {
    desugar().compile(locals, types, code, isLast);
  }

  public AST desugar() {
    // A comprehension [e | p1 <- e1 ] produces: flatten(for p1 in e1 -> [e])
    // A comprehension [e | p1 <- e1, p2 <- e2] produces: flatten(for p1 in e1 -> flatten(for p2 in e2 -> e)
    // A comprehension [e | p1 <- e1, ?p] produces: flatten(for p1 in e1 -> flatten(if p then [[e]] else []))
    return desugar(0);
  }

  private AST desugar(int i) {
    if (i == qualifiers.length)
      return new ast.lists.List(getLineStart(), getLineEnd(), exp);
    else if (i + 1 == qualifiers.length)
      return qualifiers[i].desugar(exp);
    else return new Apply(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), "flatten", null), qualifiers[i].desugar(desugar(i + 1)));
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

  public AST subst(AST ast, String name) {
    return desugar().subst(ast, name);
  }

  public void setPath(String path) {
    for (Qualifier q : qualifiers)
      q.setPath(path);
    exp.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    for (Qualifier q : qualifiers) {
      env = q.bind(env);
    }
    return new ast.types.List(getLineStart(), getLineEnd(), exp.type(env));
  }

  public String getLabel() {
    return "cmp :: " + getType();
  }

}
