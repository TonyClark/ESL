package ast.spec;

import ast.TreeNode;
import ast.types.Type;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = {})
public abstract class Action implements Located, TreeNode {

  int start = -1;
  int end = -1;

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

}
