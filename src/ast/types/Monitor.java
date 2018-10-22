package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "type" })
public class Monitor extends Type {

  public Type type;

  public Monitor() {
  }

  public Monitor(int lineStart, int lineEnd, Type type) {
    super(lineStart, lineEnd);
    this.type = type;
  }

  public void check(Env<String, Type> env) {
    type.check(env);
  }

  public void FV(HashSet<String> vars) {
    type.FV(vars);
  }

  public Type substType(Type type, String name) {
    return new Monitor(getLineStart(), getLineEnd(), this.type.substType(type, name));
  }

  public String toString() {
    return "Monitor [" + type + "]";
  }

  public boolean contains(Term term, Env<String, Type> env) {
    Type u = Type.eval(type, env);
    if (u instanceof Union) {
      Union union = (Union) u;
      return union.contains(term, env);
    } else return false;
  }

  public Type getType(Key name) {
    if (name.getString().equals("listen"))
      return getListenType();
    else throw new Error("cannot find the type of the name " + name.getString() + " in " + this);
  }

  private Type getListenType() {
    return new ast.types.TaggedFun(getLineStart(), getLineEnd(), "compiler.extensions.MonitorListen", new Type[] { getKBType() }, this);
  }

  private Type getKBType() {
    return new KB(getLineStart(), getLineEnd(), type);
  }

  public Term[] getTerms(Env<String, Type> env) {
    Type u = Type.eval(type, env);
    if (u instanceof Union) {
      Union union = (Union) u;
      return union.getTerms();
    } else throw new Error("cannot get the terms of " + type);
  }

}
