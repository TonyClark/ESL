package ast.types;

import java.util.Arrays;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "types" })
public class Term extends Type {

  public String name;
  public Type[] types;

  public Term() {
  }

  public Term(int lineStart, int lineEnd, String name, Type[] types) {
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
    if (types.length == 0)
      return name;
    else return name + "(" + separateWith(types, ",") + ")";
  }

  public Type substType(Type type, String name) {
    return new Term(getLineStart(), getLineEnd(), this.name, Type.substTypes(types, type, name));
  }

  public void check(Env<String, Type> env) {
    for (Type type : types)
      type.check(env);
  }

  public int getArity() {
    return types.length;
  }

}
