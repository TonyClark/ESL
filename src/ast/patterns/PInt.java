package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Fun;
import ast.data.Int;
import ast.refs.Ref;
import ast.tests.If;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "value" })

public class PInt extends Pattern {

  public int value;

  public PInt() {
  }

  public String toString() {
    return "PInt(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isInt(getLine(),ref, value), locals, dynamics);
  }

  public Type type(Env<String, Type> env) {
    return ast.types.Int.INT;
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Int)
      return env;
    else return null;
  }

}
