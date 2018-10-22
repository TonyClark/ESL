package ast.spec;

import java.util.Arrays;

import ast.TreeNode;
import ast.general.AST;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "vars", "states" })
public class State implements Located, TreeNode {

  public VarDec[]   vars   = new VarDec[0];
  public StateDef[] states = new StateDef[0];

  int               start  = -1;
  int               end    = -1;

  public State() {
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

  public VarDec[] getVars() {
    return vars;
  }

  public StateDef[] getStates() {
    return states;
  }

  public String toString() {
    return "States(" + Arrays.toString(vars) + "," + Arrays.toString(states) + ")";
  }

}
