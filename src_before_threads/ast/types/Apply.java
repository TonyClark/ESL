package ast.types;

import java.util.Arrays;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "types" })
public class Apply extends Type implements ReferencingLocation {

  public String    name;
  public Type[]    types;

  DeclaringLocation declaringLocation;

  public Apply() {
  }

  public Apply(int lineStart, int lineEnd, String name, Type[] types) {
    super(lineStart, lineEnd);
    this.name = name;
    this.types = types;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type[] getTypes() {
    return types;
  }

  public void setTypes(Type[] types) {
    this.types = types;
  }

  public String toString() {
    return name + "[" + separateWith(types, ",") + "]";
  }

  public Type substType(Type type, String name) {
    return new Apply(getLineStart(), getLineEnd(), this.name, Type.substTypes(types, type, name));
  }

  public Type apply(Env<String, Type> env) {
    if (env.binds(name)) {
      Type t = env.lookup(name);
      if (t instanceof TypeFun) {
        TypeFun fun = (TypeFun) t;
        return fun.apply(types);
      } else return this;
    }
    return this;
  }

  public void setDeclaringLocation(DeclaringLocation loc) {
    declaringLocation = loc;
  }

  public DeclaringLocation getDeclaringLocation() {
    return declaringLocation;
  }

  public void check(Env<String, Type> env) {
    for(Type type : types) type.check(env);
  }

}
