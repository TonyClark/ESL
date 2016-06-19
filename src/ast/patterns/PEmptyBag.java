package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.refs.Ref;
import ast.tests.If;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;

public class PEmptyBag extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new ast.tests.IsEmptyBag(value), success, new Apply(fail));
  }

  public String toString() {
    return "PEmptyBag()";
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.IsEmptyBag(getLine(),ref),locals, dynamics);
  }

  public Type type(Env<String, Type> env) {
    return ast.types.Bag.NIL;
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Bag)
      return env;
    else return null;
  }
}
