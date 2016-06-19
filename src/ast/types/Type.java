package ast.types;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;

public abstract class Type extends AST {

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
  }

  public void DV(HashSet<String> vars) {
  }

  public void FV(HashSet<String> vars) {
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
    throw new TypeError(this, "cannot type check a type");
  }

  public Type bind(Type valueType) {
    // The receiver is expected to hold a value of the supplied
    // type. This might involve making a generic type concrete...
    if (equals(valueType))
      return valueType;
    else return null;
  }

  public static <T extends Type> T expect(Class<? extends T> c, AST exp, Type t) {
    if (c.isInstance(t)) return (T) t;
    if (t instanceof Box) {
      Box box = (Box) t;
      return expect(c, exp, box.getType());
    }
    throw new TypeError(exp, "expecting a value of type " + c);
  }

  public abstract Type eval(Env<String, Type> env);
}
