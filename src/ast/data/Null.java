package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Forall;
import ast.types.Type;
import ast.types.Var;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = {})
public class Null extends AST {

  private static final int POS  = Integer.MIN_VALUE;

  public static final Type NULL = new Forall(POS, POS, new String[] { "T" }, new Var(POS, POS, "T", null));

  public Null() {
  }

  public String toString() {
    return "null";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.data.Null(getLineStart()), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
  }

  public void DV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

  public AST subst(AST ast, String name) {
    return this;
  }

  public void setPath(String path) {
  }

  public Type type(Env<String, Type> env) {
    setType(NULL);
    return getType();
  }

  public String getLabel() {
    return "null";
  }

}
