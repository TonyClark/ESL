package ast.actors;

import java.util.HashSet;

import ast.AST;
import ast.binding.Var;
import ast.data.Ref;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.control.Release;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "name" })

public class VarDynamicRef extends DynamicRef {

  public Var name;
  String     path;
  int        start = -1;
  int        end   = -1;

  public VarDynamicRef() {
  }

  public VarDynamicRef(int start, int end, Var name, String path) {
    super();
    this.name = name;
    this.path = path;
    this.start = start;
    this.end = end;
  }

  public String getLabel() {
    return "vardynamicref";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    DynamicVar dynamic = lookup(name.getName(), dynamics);
    if (dynamic == null) throw new Error("cannot grab " + name);
    dynamic.compilePush(getLineStart(), code, locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    name.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    name.FV(vars);
  }

  public int maxLocals() {
    return name.maxLocals();
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AST subst(AST ast, String n) {
    return name.subst(ast, n);
  }

  public Type type(Env<String, Type> env) {
    return name.type(env);
  }

}
