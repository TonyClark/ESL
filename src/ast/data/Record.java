package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import ast.AST;
import ast.binding.Binding;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "bindings" })

public class Record extends AST {

  public Binding[] bindings;

  public Record() {
  }

  public Record(int lineStart, int lineEnd, Binding[] bindings) {
    super(lineStart, lineEnd);
    this.bindings = bindings;
  }

  public String toString() {
    return "Record(" + Arrays.toString(bindings) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code, false);
      code.add(new instrs.data.Field(getLineStart(), Key.getKey(b.name)), locals, dynamics);
    }
    code.add(new instrs.data.Record(getLineStart(), bindings.length), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    for (Binding b : bindings)
      b.value.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (Binding b : bindings)
      b.value.DV(vars);
  }

  public int maxLocals() {
    int maxLocals = 0;
    for (Binding b : bindings)
      maxLocals = Math.max(maxLocals, b.value.maxLocals());
    return maxLocals;
  }

  public AST subst(AST ast, String name) {
    return new Record(getLineStart(), getLineEnd(), substBindings(ast, name));
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = new Binding(getLineStart(), getLineEnd(), "", bindings[i].getName(), bindings[i].getType(), bindings[i].getValue().subst(ast, name));
    return bs;
  }

  public void setPath(String path) {
    for (Binding b : bindings)
      b.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    ast.types.Field[] fields = new ast.types.Field[bindings.length];
    for (int i = 0; i < fields.length; i++)
      fields[i] = new ast.types.Field(bindings[i].getLineStart(), bindings[i].getLineEnd(), bindings[i].getName(), bindings[i].getValue().type(env));
    setType(new ast.types.Record(getLineStart(), getLineEnd(), fields));
    return getType();
  }

  public String getLabel() {
    return "record :: " + getType();
  }

}
