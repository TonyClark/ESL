package ast.types;

import java.util.Arrays;
import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "types" })
public class Tuple extends Type {

	public Type[] types;

	public Tuple() {
	}

	public Tuple(int lineStart, int lineEnd, Type[] types) {
		super(lineStart, lineEnd);
		this.types = types;
	}

	public Type[] getTypes() {
		return types;
	}

	public void setTypes(Type[] types) {
		this.types = types;
	}

	public String toString() {
		return "(" + separateWith(types, ",") + ")";
	}

	public Type substType(Type type, String name) {
		return new Tuple(getLineStart(), getLineEnd(), Type.substTypes(types, type, name));
	}

  public void check(Env<String, Type> env) {
    for(Type type : types)
      type.check(env);
  }

  public int getArity() {
    return types.length;
  }

  public void FV(HashSet<String> vars) {
    for(Type type : types)
      type.FV(vars);
  }

}
