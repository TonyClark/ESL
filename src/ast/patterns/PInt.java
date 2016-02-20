package ast.patterns;

import java.util.HashSet;

import ast.AST;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Int;
import ast.tests.If;
import exp.BoaConstructor;

@BoaConstructor(fields = { "value" })

public class PInt extends Pattern {

  public int value;

  public PInt() {
  }

  public String toString() {
    return "PInt(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new BinExp(value, "=", new Int(this.value)), success, new Apply(fail));
  }

}
