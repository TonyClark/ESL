package ast.lists;

import java.util.Arrays;
import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "elements" })

public class List extends AST {

  public AST[] elements = new AST[] {};

  public List() {
  }

  public List(int lineStart, int lineEnd, AST... elements) {
    super(lineStart, lineEnd);
    this.elements = elements;
  }

  public String toString() {
    return "List(" + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST e : elements)
      e.compile(locals, dynamics, code, false);
    code.add(new instrs.data.List(getLineStart(), elements.length), locals, dynamics);
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
    return new List(getLineStart(), getLineEnd(), subst(elements, ast, name));
  }

  public void setPath(String path) {
    for (AST element : elements)
      element.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    if (elements.length == 0) {
      setType(ast.types.List.NIL);
      return getType();
    } else {
      Type type = elements[0].type(env);
      for (int i = 1; i < elements.length; i++) {
        Type eType = elements[i].type(env);
        if (!Type.equals(type, eType, env)) throw new TypeError(elements[i].getLineStart(), elements[i].getLineEnd(), "incompatible list element types: " + type + " and " + elements[i].type(env));
      }
      setType(new ast.types.List(getLineStart(), getLineEnd(), type));
      return getType();
    }
  }

  public String getLabel() {
    return "list :: " + getType();
  }

}
