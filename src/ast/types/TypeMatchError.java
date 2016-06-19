package ast.types;

import ast.AST;

public class TypeMatchError extends TypeError {
  
  Type calculatedType;
  Type expectedType;

  public TypeMatchError(AST exp, Type calculatedType, Type expectedType) {
    super(exp,calculatedType + " does not match the expected type " + expectedType);
    this.calculatedType = calculatedType;
    this.expectedType = expectedType;
  }

}
