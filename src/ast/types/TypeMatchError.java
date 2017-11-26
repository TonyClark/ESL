package ast.types;

import ast.general.AST;

public class TypeMatchError extends TypeError {

  Type calculatedType;
  Type expectedType;

  public TypeMatchError(int lineStart, int lineEnd, Type calculatedType, Type expectedType) {
    super(lineStart, lineEnd, calculatedType + " does not match the expected type " + expectedType);
    this.calculatedType = calculatedType;
    this.expectedType = expectedType;
  }

}
