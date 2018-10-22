package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;
import list.Nil;
import runtime.data.Key;
import runtime.kb.Fact;

@BoaConstructor(fields = { "union" })
public class KB extends Type {

  // Originally written with a named type. Needs a dereferenced type. Manage both for now...

  public String union = null;
  public Type   type  = null;

  public KB() {
  }

  public KB(int lineStart, int lineEnd, String type) {
    super(lineStart, lineEnd);
    this.union = type;
  }

  public KB(int lineStart, int lineEnd, Type type) {
    super(lineStart, lineEnd);
    this.type = type;
  }

  public String toString() {
    return "KB[" + union + "]";
  }

  public String getUnion() {
    return union;
  }

  public Type substType(Type t, String name) {
    if (type != null)
      return new KB(getLineStart(), getLineEnd(), type.substType(t, name));
    else if (union != null && getUnion().equals(name))
      return new KB(getLineStart(), getLineEnd(), name);
    else return this;
  }

  public void check(Env<String, Type> env) {
    if (type != null)
      type.check(env);
    else if (union != null && env.binds(union)) {
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
    else if (name.getString().equals("asList"))
      return getAsListType();
    else throw new Error("cannot find the type of the name " + name.getString() + " in " + this);
  }

  private Type getAddType() {
    if (union != null)
      return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBAdd", new Type[] { new Var(getLineStart(), getLineEnd(), union, null), Int.INT }, this);
    else return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBAdd", new Type[] { type, Int.INT }, this);
  }

  private Type getAsListType() {
    if (union != null)
      return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBAsList", new Type[] {}, new List(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), union, null)));
    else return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBAsList", new Type[] {}, new List(getLineStart(), getLineEnd(), type));
  }

  private Type getDeleteType() {
    if (union != null)
      return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBDelete", new Type[] { new Var(getLineStart(), getLineEnd(), union, null), Int.INT }, this);
    else return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.KBDelete", new Type[] { type, Int.INT }, this);
  }

  public void FV(HashSet<String> vars) {
  }

  public Type getType(Env<String, Type> env) {
    if (union != null)
      if (env.binds(union))
        return env.lookup(union);
      else return null;
    else return type;
  }

}
