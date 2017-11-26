package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.general.AST;
import ast.refs.Ref;
import ast.tests.If;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "value" })

public class PBool extends Pattern {

  public boolean value;

  public PBool() {
  }

  public String toString() {
    return "PBool(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (value)
      code.add(new instrs.patterns.isTrue(getLineStart(), ref), locals, dynamics);
    else code.add(new instrs.patterns.IsFalse(getLineStart(), ref), locals, dynamics);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Bool)
      return env;
    else return null;
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType(ast.types.Bool.BOOL);
    cont.accept(env, ast.types.Bool.BOOL);
  }

  public Type getDeclaredType() {
    return ast.types.Bool.BOOL;
  }

  public void processDeclarations(Env<String, Type> env) {

  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return value + "";
  }

}
