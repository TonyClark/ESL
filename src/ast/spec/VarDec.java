package ast.spec;

import ast.TreeNode;
import ast.types.Type;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "type" })
public class VarDec implements Located, TreeNode {

  public String name;
  public Type   type;

  int           start = -1;
  int           end   = -1;

  public VarDec() {
  }

  public String getLabel() {
    return toString();
  }

  public int getLineStart() {
    return start;
  }

  public int getLineEnd() {
    return end;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  public String toString() {
    return "Var(" + name + "," + type + ")";
  }

}
