package ast.spec;

import java.util.Arrays;

import ast.TreeNode;
import ast.general.AST;
import ast.query.rules.Rule;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "state", "rules", "behaviour" })
public class Spec implements Located, TreeNode {

  public static Located makeInvisible(Located l) {
    l.setLineStart(Integer.MAX_VALUE);
    l.setLineEnd(Integer.MAX_VALUE);
    return l;
  }

  public State   state = new State();
  public Rule[]  rules = new Rule[0];
  public BRule[] behaviour = new BRule[0];

  int            start = -1;
  int            end   = -1;

  public Spec() {
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

  public State getState() {
    return state;
  }

  public Rule[] getRules() {
    return rules;
  }

  public BRule[] getBehaviour() {
    return behaviour;
  }

  public String toString() {
    return "Spec(" + state + "," + Arrays.toString(rules) + "," + Arrays.toString(behaviour) + ")";
  }

}
