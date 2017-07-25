package ast.types;

import java.util.Arrays;

import ast.binding.Dec;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "names", "type" })
public class TypeFun extends Type implements DecContainer  {

  public String[] names;
  public Type     type;

  public TypeFun() {
  }

  public TypeFun(int lineStart, int lineEnd, String[] names, Type type) {
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
    return new TypeFun(getLineStart(), getLineEnd(), names, type.substType(type, name));
  }

  public String toString() {
    return "fun(" + separateWith(names, ",") + ") " + type;
  }

  public boolean equals(Object other) {
    if (other instanceof TypeFun) {
      TypeFun fun = (TypeFun) other;
      if (Arrays.equals(fun.getNames(), names))
        return type.equals(fun.getType());
      else return false;
    } else return super.equals(other);
  }

  public Type apply(Type[] types) {
    if (types.length == names.length) {
      Type t = type;
      for (int i = 0; i < types.length; i++)
        t = t.substType(types[i], names[i]);
      return t;
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting " + names.length + "type arguments, but received " + types.length);
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[names.length];
    for (int i = 0; i < decs.length; i++)
      decs[i] = new Dec(getLineStart(), getLineEnd(), "", names[i], this);
    return decs;
  }

  public void check(Env<String, Type> env) {
    for(String name : names)
      env = env.bind(name, Void.VOID);
    type.check(env);
  }

}
