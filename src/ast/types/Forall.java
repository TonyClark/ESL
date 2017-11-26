package ast.types;

import java.util.HashSet;

import ast.binding.Dec;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "names", "type" })
public class Forall extends Type implements DecContainer {

  public String[] names;
  public Type     type;

  public Forall() {
  }

  public Forall(int lineStart, int lineEnd, String[] names, Type type) {
    super(lineStart, lineEnd);
    this.names = names;
    this.type = type;
  }

  public String[] getNames() {
    return names;
  }

  public Type getType() {
    return type;
  }

  public Type subst(Type[] args) {
    Type t = type;
    for (int i = 0; i < args.length; i++)
      t = t.substType(args[i], names[i]);
    return t;
  }

  public Type substType(Type type, String name) {
    for (String n : names)
      if (n.equals(name)) return this;
    return new Forall(getLineStart(), getLineEnd(), names, type.substType(type, name));
  }

  public String toString() {
    return "forall " + separateWith(names, ",") + " . " + type;
  }

  public Type apply(Type[] types) {
    if (types.length == names.length) {
      Type t = type;
      for (int i = 0; i < types.length; i++) {
        t = t.substType(types[i], names[i]);
      }
      return t;
    }
    throw new TypeError(getLineStart(), getLineEnd(), "incorrect args supplied for generic type.");
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[names.length];
    for (int i = 0; i < decs.length; i++)
      decs[i] = new Dec(getLineStart(), getLineEnd(), "", names[i], this);
    return decs;
  }

  public void check(Env<String, Type> env) {
    for (String name : names)
      env = env.bind(name, Void.VOID);
    type.check(env);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> FV = new HashSet<String>();
    type.FV(FV);
    for (String name : names)
      FV.remove(name);
    vars.addAll(FV);
  }

}
