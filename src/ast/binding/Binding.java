package ast.binding;

import ast.AST;
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

  public String getName() {
    return name;
  }

  public AST getValue() {
    return value;
  }

}
