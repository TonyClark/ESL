package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
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
    code.add(new instrs.patterns.isStr(getLine(), ref, value), locals, dynamics);
  }

  public Type type(Env<String, Type> env) {
    return ast.types.Str.STR;
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Str)
      return env;
    else return null;
  }

}
