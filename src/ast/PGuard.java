package ast;

import java.util.Arrays;
import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "guard", "pattern" })

public class PGuard extends Pattern {

  public AST     guard;
  public Pattern pattern;

  public PGuard() {
  }

  public String toString() {
    return "PGuard(" + guard + "," + pattern + ")";
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
  }

  public AST desugar(AST value, AST success, AST fail) {
    return pattern.desugar(value, new If(guard, success, new Apply(fail)), fail);
  }

}
