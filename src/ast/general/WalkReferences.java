package ast.general;

import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.types.Type;
import env.Env;

public class WalkReferences extends Walker {

  // Find all the references for a given declaring location...

  DeclaringLocation           loc;
  Vector<ReferencingLocation> references = new Vector<ReferencingLocation>();

  public WalkReferences(DeclaringLocation loc) {
    super();
    this.loc = loc;
  }

  public DeclaringLocation getLoc() {
    return loc;
  }

  public Vector<ReferencingLocation> getReferences() {
    return references;
  }

  public void walkReference(ReferencingLocation ref, Env<String, Type> env) {
    if (ref.getDeclaringLocation() == getLoc()) getReferences().add(ref);
  }

  public void walk(Object obj, Env<String, Type> vars) {
    if (obj != null) {
      if (obj instanceof ReferencingLocation) {
        walkReference((ReferencingLocation) obj, vars);
        super.walk(obj, vars);
      } else super.walk(obj, vars);
    }
  }

}
