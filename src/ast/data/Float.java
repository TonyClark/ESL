package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "n", "m" })
public class Float extends AST {

  public int n;
  public int m;

  public Float() {
  }

  public Float(int n, int m) {
  }

  public String toString() {
    return "Float(" + n + "." + m + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> types, CodeBox code, boolean isLast) {
    code.add(new instrs.data.Float(getLineStart(), new Double(new String(n + "." + m)).doubleValue()), locals, types);
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
    setType(ast.types.Float.FLOAT);
    return getType();
  }

  public String getLabel() {
    return "float :: " + getType();
  }

}
