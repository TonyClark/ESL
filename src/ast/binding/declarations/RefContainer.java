package ast.binding.declarations;

import ast.binding.Dec;
import env.Env;

public interface RefContainer {

  public ReferencingLocation[] getContainedRefs();

}
