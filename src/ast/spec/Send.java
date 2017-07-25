package ast.spec;

import java.util.Arrays;

import ast.query.value.Value;
import exp.BoaConstructor;

@BoaConstructor(fields = { "target", "name", "args" })
public class Send extends Action {

  public Value   target;
  public String  name;
  public Value[] args;

  public Send() {
  }

  public String toString() {
    return "Send(" + target + "," + name + "," + Arrays.toString(args) + ")";
  }

}
