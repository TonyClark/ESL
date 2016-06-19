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

@BoaConstructor(fields = { "name", "type", "pattern" })

public class PBind extends Pattern {

  public String  name;
  public Type    type;
  public Pattern pattern;

  public PBind() {
  }

  public PBind(String name, Type type, Pattern pattern) {
    super();
    this.name = name;
    this.pattern = pattern;
  }

  public String toString() {
    return "PBind(" + name + "," + pattern + ")";
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
    vars.add(name);
  }

  public void bound(Vector<String> vars) {
    pattern.bound(vars);
    vars.add(name);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (AST.lookup(name, locals) != null) {
      AST.lookup(name, locals).bind(ref, getLine(), code, locals, dynamics);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, getLine(), code, locals, dynamics);
    }
    pattern.compile(locals, dynamics, ref, code);
  }

  public Type type(Env<String, Type> env) {
    Type t = pattern.type(env);
    if (type.bind(t) != null)
      return type;
    else throw new TypePatternError(this, "declaration does not match pattern type " + t);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    return env.bind(name, type);
  }

}
