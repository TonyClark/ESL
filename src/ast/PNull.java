package ast;

import java.util.HashSet;

public class PNull extends Pattern {

  public void vars(HashSet<String> vars) {

  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new IsNull(value), success, new Apply(fail));
  }
}
