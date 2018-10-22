package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public class EVar extends Exp {

  String name;

  public EVar(String name) {
    super();
    this.name = name;
  }

  public Object eval(Tree tree, VarTable vars) {
    if(vars.containsKey(name)) {
      return vars.get(name).get(0).eval(tree);
    } else throw new Error("unbound var: " + name);
  }
  
  public String toString() {
    return name;
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$Var",null,new AST[] {new ast.data.Str(name)});
  }

}
