package ast.tests;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import instrs.Instr;
import list.List;

public class IsTerm extends AST {

  AST    value;
  String name;
  int    arity;

  public IsTerm(AST value, String name, int arity) {
    super();
    this.value = value;
    this.name = name;
    this.arity = arity;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (isLocal(locals))
      compileLocalIsTerm(locals, dynamics, code);
    else if (isDynamic(dynamics))
      compileDynamicIsTerm(locals, dynamics, code);
    else {
      value.compile(locals, dynamics, code, false);
      code.add(new instrs.tests.IsTerm(getLineStart(), name, arity), locals, dynamics);
    }
  }

  private void compileLocalIsTerm(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    Var v = (Var) value;
    lookup(v.name, locals).isTerm(name, arity, getLineStart(), code, locals, dynamics);
  }

  private void compileDynamicIsTerm(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    Var v = (Var) value;
    lookup(v.name, dynamics).isTerm(name, arity, getLineStart(), code, locals, dynamics);
  }

  private boolean isLocal(List<FrameVar> locals) {
    if (value instanceof Var) {
      Var v = (Var) value;
      return lookup(v.name, locals) != null;
    } else return false;
  }

  private boolean isDynamic(List<DynamicVar> dynamics) {
    if (value instanceof Var) {
      Var v = (Var) value;
      return lookup(v.name, dynamics) != null;
    } else return false;
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public int maxLocals() {
    return value.maxLocals();
  }

  public String toString() {
    return "IsTerm(" + value + "," + name + "," + arity + ")";
  }

  public AST subst(AST ast, String name) {
    return new IsTerm(value.subst(ast, name), this.name, arity);
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    value.type(env);
    return ast.types.Bool.BOOL;
  }

  public String getLabel() {
    return "IsTerm " + name + " " + arity + " :: " + getType();
  }

}
