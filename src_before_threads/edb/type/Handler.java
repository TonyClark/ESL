package edb.type;

import ast.patterns.Pattern;

public class Handler {

  Pattern pattern;

  public Handler(Pattern pattern) {
    this.pattern = pattern;
  }

  public String toString() {
    return "->" + pattern.pprint();
  }

  public Pattern getPattern() {
    return pattern;
  }

}
