package ast;

import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "value" })

public class PBool extends Pattern {

  public boolean value;

  public PBool() {
  }

  public String toString() {
    return "PBool(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new BinExp(value, "=", new Bool(this.value)), success, new Apply(fail));
  }

}
