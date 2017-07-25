package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.AST;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Fun;
import ast.data.Str;
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

public class PStr extends Pattern {

  public String value;

  public PStr() {
  }

  public String toString() {
    return "PStr(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isStr(getLineStart(), ref, value), locals, dynamics);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType(ast.types.Str.STR);
    cont.accept(env, ast.types.Str.STR);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Str)
      return env;
    else return null;
  }

  public Type getDeclaredType() {
    return ast.types.Str.STR;
  }

  public void processDeclarations(Env<String, Type> env) {
    
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return value;
  }

}
