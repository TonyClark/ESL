package ast.patterns;

import java.util.HashSet;

import ast.AST;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Str;
import ast.tests.If;
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
