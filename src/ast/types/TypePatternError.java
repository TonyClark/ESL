package ast.types;

import ast.patterns.Pattern;

public class TypePatternError extends Error {

  Pattern pattern;

  public TypePatternError(Pattern pattern, String message) {
    super(message);
    this.pattern = pattern;
  }

  public Pattern getPattern() {
    return pattern;
  }

}
