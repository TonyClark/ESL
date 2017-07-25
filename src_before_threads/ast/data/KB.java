package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.Union;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "type", "elements" })

public class KB extends AST {

  public Type  type;
  public AST[] elements = new AST[] {};

  public KB() {
  }

  public KB(int lineStart, int lineEnd, Type type, AST... elements) {
    super(lineStart, lineEnd);
    this.type = type;
    this.elements = elements;
  }

  public String toString() {
    return "KB(" + type + "," + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST e : elements)
      e.compile(locals, dynamics, code, false);
    code.add(new instrs.data.KB(getLineStart(), elements.length), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    for (AST e : elements)
      e.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    DV(elements, vars);
  }

  public int maxLocals() {
    return maxLocals(elements);
  }

  public AST subst(AST ast, String name) {
    return new KB(getLineStart(), getLineEnd(), type, subst(elements, ast, name));
  }

  public void setPath(String path) {
    for (AST element : elements)
      element.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type declaredType = Type.eval(type, env);
    if (declaredType instanceof ast.types.KB) {
      checkElements((ast.types.KB) declaredType, env);
      setType(declaredType);
      return getType();
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a KB type: " + declaredType);
  }

  private void checkElements(ast.types.KB kb, Env<String, Type> env) {
    String unionName = kb.getUnion();
    if (env.binds(unionName) && env.lookup(unionName) instanceof ast.types.Union) {
      ast.types.Union union = (ast.types.Union) env.lookup(unionName);
      for (AST e : elements) {
        Type t = e.type(env);
        if (!Type.equals(union, t, env)) throw new TypeError(e.getLineStart(), e.getLineEnd(), "expecting a member of the union: " + unionName);
      }
    }
  }

  public String getLabel() {
    return "list :: " + getType();
  }

}
