package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class Array extends Type {

	private static final int	POS	= Integer.MIN_VALUE;

	public Type								type;

	public Array() {
	}

	public Array(int lineStart, int lineEnd, Type type) {
		super(lineStart, lineEnd);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String toString() {
		return "Array[" + type + "]";
	}

	public Type substType(Type t, String name) {
		return new Array(getLineStart(), getLineEnd(), type.substType(t, name));
	}

  public void check(Env<String, Type> env) {
    type.check(env);
  }

  public void FV(HashSet<String> vars) {
    type.FV(vars);
  }

}
