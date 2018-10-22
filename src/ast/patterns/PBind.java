package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.Dec;
import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "name", "type", "pattern" })

public class PBind extends Pattern {

  public String  name;
  public Type    type;
  public Pattern pattern;

  public PBind() {
  }

  public PBind(int lineStart, int lineEnd, String name, Type type, Pattern pattern) {
    super(lineStart, lineEnd);
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
      AST.lookup(name, locals).bind(ref, getLineStart(), code, locals, dynamics);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, getLineStart(), code, locals, dynamics);
    }
    pattern.compile(locals, dynamics, ref, code);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    return env.bind(name, type);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    pattern.type(env, (env1, t) ->
    {
      if (Type.equals(type, t, env)) {
        setType(type);
        cont.accept(env1.bind(name, type), type);
      } else throw new TypePatternError(this, "declaration does not match pattern type " + t);
    });
  }

  public Type getDeclaredType() {
    return type;
  }

  public void processDeclarations(Env<String, Type> env) {
    pattern.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] locs = pattern.getContainedDecs();
    return AST.concatenate(locs, new DeclaringLocation[] { new Dec(getLineStart(), getLineEnd(), "", name, type,type) });
  }

  public String pprint() {
    return pattern.pprint() + "=" + name + "::" + type;
  }

}
