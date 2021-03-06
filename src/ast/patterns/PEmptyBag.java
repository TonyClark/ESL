package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Apply;
import ast.data.Fun;
import ast.general.AST;
import ast.refs.Ref;
import ast.tests.If;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Apply;
import ast.data.Fun;
import ast.general.AST;
import ast.refs.Ref;
import ast.tests.If;
import ast.tests.IsNil;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { })
public class PEmptyBag extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(getLineStart(), getLineEnd(), new ast.tests.IsEmptyBag(value), success, new Apply(getLineStart(), getLineEnd(), "", fail));
  }

  public String toString() {
    return "PEmptyBag()";
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.IsEmptyBag(getLineStart(),ref),locals, dynamics);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType( ast.types.Bag.NIL);
    cont.accept(env, ast.types.Bag.NIL);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Bag)
      return env;
    else return null;
  }

  public Type getDeclaredType() {
    return ast.types.Bag.NIL;
  }

  public void processDeclarations(Env<String, Type> env) {
    
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return "Bag{}";
  }
}
