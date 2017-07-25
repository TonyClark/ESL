package ast.spec;

import java.util.Arrays;

import ast.query.value.Value;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "value" })
public class Update extends Action {

  public String name;
  public Value  value;

  public Update() {
  }

  public String toString() {
    return "Update(" + name + "," + value + ")";
  }

}
