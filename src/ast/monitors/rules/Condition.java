package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public abstract class Condition {

  public abstract boolean satisfied(Tree tree, VarTable vars);

  public abstract AST asTerm();

}
