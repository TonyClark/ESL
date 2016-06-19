package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "n", "m" })
public class Float extends AST {

  public int n;
  public int m;

  public Float() {
  }

  public String toString() {
    return "Float(" + n + "." + m + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> types, CodeBox code, boolean isLast) {
    throw new Error("Float.compile is not implemented.");
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
    return ast.types.Float.FLOAT;
  }

}
