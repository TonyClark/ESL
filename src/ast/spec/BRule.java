package ast.spec;

import java.util.Arrays;

import ast.TreeNode;
import ast.query.body.BodyElement;
import ast.query.value.Value;
import ast.types.Type;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "sourceName", "sourceArgs", "messageName", "messageArgs", "condition", "targetName", "targetArgs", "actions" })
public class BRule implements Located, TreeNode {

  public String        sourceName;
  public Value[]       sourceArgs;
  public String        messageName;
  public Value[]       messageArgs;
  public BodyElement[] condition;
  public String        targetName;
  public Value[]       targetArgs;
  public Action[]      actions;

  int                  start = -1;
  int                  end = -1;

  public BRule() {
  }

  public Action[] getActions() {
    return actions;
  }

  public BodyElement[] getCondition() {
    return condition;
  }

  public String getLabel() {
    return toString();
  }

  public int getLineEnd() {
    return end;
  }

  public int getLineStart() {
    return start;
  }

  public Value[] getMessageArgs() {
    return messageArgs;
  }

  public String getMessageName() {
    return messageName;
  }

  public Value[] getSourceArgs() {
    return sourceArgs;
  }

  public String getSourceName() {
    return sourceName;
  }

  public Value[] getTargetArgs() {
    return targetArgs;
  }

  public String getTargetName() {
    return targetName;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }
  
  public int getSourceArity() {
    return sourceArgs.length;
  }
  
  public int getTargetArity() {
    return targetArgs.length;
  }

  public String toString() {
    return "BRule(" + sourceName + "," + Arrays.toString(sourceArgs) + "," + messageName + "," + Arrays.toString(messageArgs) + "," + Arrays.toString(condition) + "," + targetName + "," + Arrays.toString(targetArgs) + "," + Arrays.toString(actions) + ")";
  }

}
