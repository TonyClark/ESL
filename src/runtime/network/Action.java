package runtime.network;

import java.util.Arrays;

import ast.monitors.code.VarTable;
import runtime.functions.Closure;

public class Action {

  String   name;
  String[] argNames;
  Closure  closure;

  public Action(String name, String[] argNames, Closure closure) {
    this.name = name;
    this.argNames = argNames;
    this.closure = closure;
  }

  public String toString() {
    return "Action(" + name + Arrays.toString(argNames) + ")";
  }

  public void add(Tree tree, Network network, VarTable vars) {
    network.add(this, tree, vars);
  }

  public void remove(Tree tree, Network network) {
    network.remove(this, tree);
  }

  public String getName() {
    return name;
  }

  public String[] getArgNames() {
    return argNames;
  }

  public Closure getClosure() {
    return closure;
  }

}
