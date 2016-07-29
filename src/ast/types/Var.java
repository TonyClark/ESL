package ast.types;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })
public class Var extends Type implements ReferencingLocation {

  public String     name;
  DeclaringLocation declaringLocation;

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

}
