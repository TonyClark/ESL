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
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class PWild extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public String toString() {
    return "PWild()";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType(ast.types.Void.VOID);
    cont.accept(env, ast.types.Void.VOID);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    return env;
  }

  public Type getDeclaredType() {
    // A wildcard pattern should declare its type.
    return ast.types.Void.VOID;
  }
 
  public void processDeclarations(Env<String, Type> env) {
   
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return "_";
  }
}
