package ast.actors;

import java.util.HashSet;

import ast.data.Ref;
import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "actor", "name" })

public class ActorDynamicRef extends DynamicRef {

  public AST actor;
  public Key name;
  String     path;
  int        start = -1;
  int        end   = -1;

  public ActorDynamicRef() {
  }

  public ActorDynamicRef(int start, int end, AST actor, Key name, String path) {
    super();
    this.actor = actor;
    this.name = name;
    this.path = path;
    this.start = start;
    this.end = end;
  }

  public String getLabel() {
    return "actordynamicref";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    actor.compile(locals, dynamics, code, isLast);
    code.add(new instrs.vars.DynamicRef(start, name), locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    actor.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    actor.FV(vars);
  }

  public int maxLocals() {
    return actor.maxLocals();
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AST subst(AST ast, String n) {
    return new ActorDynamicRef(start, end, actor.subst(ast, n), name, path);
  }

  public Type type(Env<String, Type> env) {
    return new Ref(start, end, actor, name).type(env);
  }

}
