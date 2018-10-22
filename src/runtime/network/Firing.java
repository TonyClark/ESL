package runtime.network;

import ast.monitors.code.VarTable;

public class Firing {

  Action   action;
  Tree     tree;
  VarTable vars;

  public Firing(Action action, Tree tree, VarTable vars) {
    super();
    this.action = action;
    this.tree = tree;
    this.vars = vars;
  }

  public String toString() {
    return "Firing(" + action + "," + tree + ")";
  }

  public Action getAction() {
    return action;
  }

  public Tree getTree() {
    return tree;
  }

  public VarTable getVars() {
    return vars;
  }

}
