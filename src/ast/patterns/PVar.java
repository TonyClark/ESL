package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name", "type" })

public class PVar extends Pattern {

  public String name;
  public Type   type;

  public PVar() {
  }

  public PVar(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public String toString() {
    return "PVar(" + name + ")";
  }

  public void vars(HashSet<String> vars) {
    vars.add(name);
  }

  public void bound(Vector<String> vars) {
    vars.add(name);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (AST.lookup(name, locals) != null) {
      AST.lookup(name, locals).bind(ref, getLine(), code, locals, dynamics);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, getLine(), code, locals, dynamics);
    }
  }

  public Type type(Env<String, Type> env) {
    return type;
  }

  public Env<String, Type> bind(Env<String, Type> env, Type t) {
    if (type.bind(t) != null)
      return env.bind(name, type);
    else throw new TypePatternError(this, "incompatible types " + type + " and " + t);
  }

}
