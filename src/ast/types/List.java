package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "type" })
public class List extends Type {

	private static final int	POS	= Integer.MIN_VALUE;

	public static final Type	NIL	= new Forall(POS, POS, new String[] { "T" }, new List(POS, POS, new Var(POS, POS, "T", null)));

	public Type								type;

	public List() {
	}

	public List(int lineStart, int lineEnd, Type type) {
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
		return "[" + type + "]";
	}

	public Type substType(Type t, String name) {
		return new List(getLineStart(), getLineEnd(), type.substType(t, name));
	}

  public void check(Env<String, Type> env) {
    type.check(env);
  }

  public void FV(HashSet<String> vars) {
    type.FV(vars);
  }

}
