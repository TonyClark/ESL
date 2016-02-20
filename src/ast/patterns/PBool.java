package ast.patterns;

import java.util.HashSet;

import ast.AST;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Bool;
import ast.tests.If;
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
