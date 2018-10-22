package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public class Int extends Exp {

  int value;

  public Int(int value) {
    super();
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String toString() {
    return Integer.toString(value);
  }

  public Object eval(Tree tree, VarTable vars) {
    return value;
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$Int",null,new AST[] {new ast.data.Int(value)});
  }

}
