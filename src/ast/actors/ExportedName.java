package ast.actors;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name" })
public class ExportedName implements Located, ReferencingLocation {

  public String     name;
  DeclaringLocation declaringLocation;
  int               start = -1;
  int               end   = -1;

  public ExportedName() {
  }

  public ExportedName(int lineStart, int lineEnd, String name, DeclaringLocation declaringLocation) {
    this.start = lineStart;
    this.end = lineEnd;
    this.name = name;
    this.declaringLocation = declaringLocation;
  }

  public String toString() {
    return "ExportedName(" + getLineStart() + "," + getLineEnd() + "," + name + ")";
  }

  public DeclaringLocation getDeclaringLocation() {
    return declaringLocation;
  }

  public void setDeclaringLocation(DeclaringLocation declaringLocation) {
    this.declaringLocation = declaringLocation;
  }

  public int getLineStart() {
    return start;
  }

  public int getLineEnd() {
    return end;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public String getName() {
    return name;
  }

}
