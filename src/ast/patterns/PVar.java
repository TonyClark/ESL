package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

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

@BoaConstructor(fields = { "name", "declaredType" })

public class PVar extends Pattern implements DeclaringLocation {

  public String name;
  public Type   declaredType;

  public PVar() {
  }

  public PVar(String name, Type declaredType) {
    this.name = name;
    this.declaredType = declaredType;
  }

  public String toString() {
    return "PVar(" + name + "," + declaredType + ")";
  }

  public void vars(HashSet<String> vars) {
    vars.add(name);
  }

  public void bound(Vector<String> vars) {
    vars.add(name);
  }

  public String getName() {
    return name;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (AST.lookup(name, locals) != null) {
      AST.lookup(name, locals).bind(ref, getLineStart(), code, locals, dynamics);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, getLineStart(), code, locals, dynamics);
    }
  }

  public Env<String, Type> bind(Env<String, Type> env, Type t) {
    if (Type.equals(declaredType, t, env))
      return env.bind(name, t);
    else throw new TypePatternError(this, "incompatible types " + declaredType + " and " + t);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    Type type = declaredType;
    setType(type);
    cont.accept(env.bind(name, type), type);
  }

  public String getLabel() {
    return name + " :: " + getType();
  }

  public Type getDeclaredType() {
    return declaredType;
  }

  public void setDeclaredType(Type declaredType) {
    this.declaredType = declaredType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void processDeclarations(Env<String, Type> env) {
    if (env.binds(name)) {
      setDeclaredType(env.lookup(name));
    }
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] { this };
  }

  public String pprint() {
    return name + "::" + declaredType;
  }

}
