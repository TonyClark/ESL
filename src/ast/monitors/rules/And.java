package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public class And extends Condition {

  Condition left;
  Condition right;

  public And(Condition left, Condition right) {
    super();
    this.left = left;
    this.right = right;
  }

  public boolean satisfied(Tree tree, VarTable vars) {
    return left.satisfied(tree, vars) && right.satisfied(tree, vars);
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$And",null,new AST[] {left.asTerm(),right.asTerm()});
  }

}
