package ast.patterns;

import java.util.HashSet;

import ast.AST;
import ast.data.Apply;
import ast.tests.If;
import ast.tests.IsNull;

public class PNull extends Pattern {

  public void vars(HashSet<String> vars) {

  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new IsNull(value), success, new Apply(fail));
  }
}
