package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public class True extends Condition {

  public boolean satisfied(Tree tree, VarTable vars) {
    return true;
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$True",null,new AST[] {});
  }
  
  public String toString() {
    return "True()";
  }

}
