package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.control.Release;
import list.List;

@BoaConstructor(fields = { "vars", "body" })

public class Grab extends AST {

  public DynamicRef[] vars;
  public AST          body;

  public Grab() {
  }

  public Grab(int lineStart, int lineEnd, DynamicRef[] vars, AST body) {
    super(lineStart, lineEnd);
    this.vars = vars;
    this.body = body;
  }

  public String toString() {
    return "Grab(" + Arrays.toString(vars) + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (DynamicRef ref : vars) {
      ref.compile(locals, dynamics, code, isLast);
    }
    code.add(new instrs.control.Grab(getLineStart(), vars.length), locals, dynamics);
    body.compile(locals, dynamics, code, false);
    for (DynamicRef ref : vars) {
      ref.compile(locals, dynamics, code, isLast);
    }
    code.add(new Release(getLineStart(), vars.length), locals, dynamics);
  }

  public void FV(HashSet<String> FV) {
    body.FV(FV);
    for (AST v : vars)
      v.FV(FV);
  }

  public void DV(HashSet<String> DV) {
    body.DV(DV);
    for (AST v : vars)
      v.DV(DV);
  }

  public int maxLocals() {
    return body.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Grab(getLineStart(), getLineEnd(), vars, body.subst(ast, name));
  }

  public void setPath(String path) {
    body.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    for (DynamicRef ref : vars)
      ref.type(env);
    return body.type(env);
  }

  public String getLabel() {
    return "grab :: " + getType();
  }

}
