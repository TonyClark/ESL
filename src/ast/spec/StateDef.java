package ast.spec;

import java.util.Arrays;

import ast.TreeNode;
import ast.query.body.BodyElement;
import ast.query.value.Value;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "args", "body" })
public class StateDef implements Located, TreeNode {

  public String        name;
  public Value[]       args;
  public BodyElement[] body;

  int                  start = -1;
  int                  end   = -1;

  public StateDef() {
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

  public Value[] getArgs() {
    return args;
  }

  public BodyElement[] getBody() {
    return body;
  }

  public String toString() {
    return "State(" + name + "," + Arrays.toString(args) + "," + Arrays.toString(body) + ")";
  }

  public String pprint() {
    String s = name;
    if (args.length > 0) {
      s = s + "(";
      for (int i = 0; i < args.length; i++) {
        s = s + args[i];
        if (i + 1 < args.length) s = s + ",";
      }
      s = s + ")";
    }
    if (body.length > 0) {
      s = s + " <- ";
      for (int i = 0; i < body.length; i++) {
        s = s + body[i];
        if (i + 1 < body.length) s = s + ",";
      }
    }
    return s;
  }

}
