package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.refs.Ref;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;

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

  public Type type(Env<String, Type> env) {
    return ast.types.Void.VOID;
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    return env;
  }
}
