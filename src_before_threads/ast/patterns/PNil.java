package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.AST;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Apply;
import ast.data.Fun;
import ast.refs.Ref;
import ast.tests.If;
import ast.tests.IsNil;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class PNil extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public String toString() {
    return "PNil()";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isNil(getLineStart(), ref), locals, dynamics);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType( ast.types.List.NIL);
    cont.accept(env, ast.types.List.NIL);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.List)
      return env;
    else return null;
  }

  public Type getDeclaredType() {
    return ast.types.List.NIL;
  }

  public void processDeclarations(Env<String, Type> env) {
    
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return "[]";
  }
}
