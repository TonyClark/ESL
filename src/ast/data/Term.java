package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.types.Type;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name", "values" })

public class Term extends AST {

  public String name;

  public AST[]  values;

  public Term() {
  }

  public Term(String name, AST[] values) {
    super();
    this.name = name;
    this.values = values;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST value : values)
      value.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Term(getLine(), Key.getKey(name), values.length), locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    DV(values, vars);
  }

  public void FV(HashSet<String> vars) {
    for (AST v : values)
      v.FV(vars);
  }

  public int maxLocals() {
    return maxLocals(values);
  }

  public AST subst(AST ast, String name) {
    return new Term(this.name, subst(values, ast, name));
  }

  public String toString() {
    return "Term(" + name + "," + Arrays.toString(values) + ")";
  }

  public void setPath(String path) {
    for (AST value : values)
      value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type[] types = new Type[values.length];
    for (int i = 0; i < types.length; i++)
      types[i] = values[i].type(env);
    return new ast.types.Term(name, types);
  }

}
