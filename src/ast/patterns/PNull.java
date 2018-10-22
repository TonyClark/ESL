package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.declarations.DeclaringLocation;
import ast.refs.Ref;
import ast.types.Forall;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;
import types.Var;

@BoaConstructor(fields = { })
public class PNull extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isNull(getLineStart(), ref), locals, dynamics);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    setType( ast.types.Null.NULL);
    cont.accept(env, new Forall(getLineStart(),getLineEnd(),new String[] {"T"},new ast.types.Var(getLineStart(),getLineEnd(),"T", null)));
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Null)
      return env;
    else return null;
  }

  public Type getDeclaredType() {
    return ast.types.Null.NULL;
  }

  public void processDeclarations(Env<String, Type> env) {
    
  }

  public DeclaringLocation[] getContainedDecs() {
    return new DeclaringLocation[] {};
  }

  public String pprint() {
    return "null";
  }
}
