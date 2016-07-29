package ast.binding.declarations;

import values.Located;

public interface ReferencingLocation extends Located {

  public String getName();

  public void setDeclaringLocation(DeclaringLocation loc);

  public DeclaringLocation getDeclaringLocation();

}
