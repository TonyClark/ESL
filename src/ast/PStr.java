package ast;

import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "value" })

public class PStr extends Pattern {

  public String value;

  public PStr() {
  }

  public String toString() {
    return "PStr(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new BinExp(value, "=", new Str(this.value)), success, new Apply(fail));
  }

}
