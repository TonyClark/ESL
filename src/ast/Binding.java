package ast;

import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "value" })

public class Binding {

  public String name;
  public AST    value;

  public Binding() {
  }

  public Binding(String name, AST value) {
    super();
    this.name = name;
    this.value = value;
  }

  public String toString() {
    return "Binding(" + name + "," + value + ")";
  }

}
