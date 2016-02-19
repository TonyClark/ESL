package ast;

import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "pattern", "exp" })

public class BQual extends Qualifier {

  public Pattern pattern;
  public AST     exp;

  public BQual() {
  }

  public String toString() {
    return "BQual(" + pattern + "," + exp + ")";
  }

  public void FV(HashSet<String> vars) {
    exp.FV(vars);
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
  }

  public AST desugar(AST value) {
    return new Map(pattern, exp, value);
  }

}
