package ast.types;

import java.util.HashSet;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })
public class Var extends Type implements ReferencingLocation {

	public String			name;
	DeclaringLocation	declaringLocation;

	public Var() {
	}

	public Var(int lineStart, int lineEnd, String name, DeclaringLocation declaringLocation) {
		super(lineStart, lineEnd);
		this.name = name;
		this.declaringLocation = declaringLocation;
	}

	public DeclaringLocation getDeclaringLocation() {
		return declaringLocation;
	}

	public String getLabel() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setDeclaringLocation(DeclaringLocation loc) {
		declaringLocation = loc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type substType(Type type, String name) {
		if (name.equals(getName()))
			return type;
		else return this;
	}

	public String toString() {
		return name;
	}

	public void check(Env<String, Type> env) { 
	  if (!env.binds(name)) { throw new TypeError(getLineStart(), getLineEnd(), "unbound type variable " + name); }
	}

  public void FV(HashSet<String> vars) {
    vars.add(name);
  }

}
