package ast.lists;

import java.util.Arrays;
import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "elements" })

public class Bag extends AST {

  public AST[] elements = new AST[] {};

  public Bag() {
  }

  public Bag(int lineStart, int lineEnd, AST... elements) {
    super(lineStart, lineEnd);
    this.elements = elements;
  }

  public String toString() {
    return "Bag(" + Arrays.toString(elements) + ")";
  }

  public void compile(list.List<FrameVar> locals, list.List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST e : elements)
      e.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Bag(getLineStart(), elements.length), locals, dynamics);
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
    return new Bag(getLineStart(), getLineEnd(), subst(elements, ast, name));
  }

  public void setPath(String path) {
    for (AST element : elements)
      element.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    if (elements.length == 0) {
      setType(ast.types.Bag.NIL);
      return getType();
    } else {
      Type type = elements[0].type(env);
      for (int i = 1; i < elements.length; i++) {
        if (!Type.equals(type, elements[i].type(env), env)) { throw new TypeError(getLineStart(), getLineEnd(), "incompatible bag element types."); }
      }
      setType(new ast.types.Bag(getLineStart(), getLineEnd(), type));
      return getType();
    }
  }

  public String getLabel() {
    return "bag :: " + getType();
  }

}
