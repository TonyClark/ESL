package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.False;
import instrs.data.True;
import list.List;

@BoaConstructor(fields = { "value" })
public class Bool extends AST {

  public static final AST TRUE  = new Bool(true);
  public static final AST FALSE = new Bool(false);

  public boolean          value;

  public Bool() {
  }

  public Bool(boolean value) {
    this.value = value;
  }

  public String toString() {
    return Boolean.toString(value);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (value)
      code.add(new True(getLineStart()), locals, dynamics);
    else code.add(new False(getLineStart()), locals, dynamics);
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
    setType(ast.types.Bool.BOOL);
    return getType();
  }

  public String getLabel() {
    return value + "";
  }

}
