package ast.types;

import java.util.Arrays;

import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "union" })
public class KB extends Type {

  public String union;

  public KB() {
  }

  public KB(int lineStart, int lineEnd, String type) {
    super(lineStart, lineEnd);
    this.union = type;
  }

  public String toString() {
    return "KB[" + union + "]";
  }

  public String getUnion() {
    return union;
  }

  public Type substType(Type t, String name) {
    if (getUnion().equals(name))
      return new KB(getLineStart(), getLineEnd(), name);
    else return this;
  }

  public void check(Env<String, Type> env) {
    if (env.binds(union)) {
      Type t = env.lookup(union);
      t = Type.eval(t, env);
      if (!(t instanceof ast.types.Union)) throw new TypeError(getLineStart(), getLineEnd(), "expecting a union type: " + union);
    } else throw new TypeError(getLineStart(), getLineEnd(), "unbound name: " + union);
  }

  public Type getType(Key name) {
    if (name.getString().equals("add"))
      return getAddType();
    else if (name.getString().equals("delete"))
      return getDeleteType();
    else throw new Error("cannot find the type of the name " + name.getString() + " in " + this);
  }

  private Type getAddType() {
    return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBAdd", new Type[] { new Var(getLineStart(), getLineEnd(), union, null), Int.INT }, this);
  }

  private Type getDeleteType() {
    return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBDelete", new Type[] { new Var(getLineStart(), getLineEnd(), union, null), Int.INT }, this);
  }

}
