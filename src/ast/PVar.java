package ast;

import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })

public class PVar extends Pattern {

  public String name;

  public PVar() {
  }

  public PVar(String name) {
    this.name = name;
  }

  public String toString() {
    return "PVar(" + name + ")";
  }

  public void vars(HashSet<String> vars) {
    vars.add(name);
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new Let(new Binding[] { new Binding(name, value) }, success);
  }

}
