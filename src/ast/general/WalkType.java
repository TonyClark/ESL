package ast.general;

import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.types.Type;
import env.Env;

public class WalkType<T> extends Walker {

  // Find all the references for a given class...

  Class<T>  c;
  Vector<T> references = new Vector<T>();

  public WalkType(Class<T> c) {
    super();
    this.c = c;
  }

  public Vector<T> getReferences() {
    return references;
  }

  public void walk(Object obj, Env<String, Type> vars) {
    if (obj != null) {
      if (c.isInstance(obj)) {
        references.add((T) obj);
        super.walk(obj, vars);
      } else super.walk(obj, vars);
    }
  }

}
