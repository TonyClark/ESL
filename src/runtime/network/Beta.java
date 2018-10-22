package runtime.network;

import java.util.Vector;

import ast.monitors.code.Eql;
import ast.monitors.code.VarTable;
import ast.monitors.code.paths.Left;
import ast.monitors.code.paths.Path;
import ast.monitors.code.paths.Right;
import ast.monitors.rules.Condition;
import ast.monitors.rules.True;

public class Beta extends ToBeta {

  Vector<Tree>   leftMemory    = new Vector<Tree>();
  Vector<Tree>   rightMemory   = new Vector<Tree>();
  Vector<Eql>    varEqualities = new Vector<Eql>();
  Vector<Action> actions       = new Vector<Action>();
  Condition      condition     = new True();
  VarTable       vars          = new VarTable();

  public void add(Action action) {
    actions.add(action);
  }

  public void addLeft(Tree left, Network network) {
    leftMemory.add(left);
    for (Tree right : rightMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.add(tree, network,vars);
        }
        for (BetaConnection connection : output) {
          connection.add(tree, network);
        }
      }
    }
  }

  public void addRight(Tree right, Network network) {
    rightMemory.add(right);
    for (Tree left : leftMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.add(tree, network,vars);
        }
        for (BetaConnection connection : output) {
          connection.add(tree, network);
        }
      }
    }
  }

  public void addVarChecks(VarTable leftTable, VarTable rightTable) {
    for (String leftName : leftTable.keySet()) {
      for (String rightName : rightTable.keySet()) {
        if (leftName.equals(rightName)) {
          Path leftPath = leftTable.get(leftName).get(0);
          Path rightPath = rightTable.get(rightName).get(0);
          varEqualities.add(new Eql(new Left(leftPath), new Right(rightPath)));
        }
      }
    }
  }

  public boolean eqlChecks(Tree tree) {
    for (Eql eql : varEqualities) {
      if (!eql.check(tree)) return false;
    }
    return true;
  }

  public Condition getCondition() {
    return condition;
  }

  public VarTable getVars() {
    return vars;
  }

  public void remove(Tree tree, Vector<Tree> memory) {
    Tree found = null;
    for (Tree t : memory) {
      if (t.equals(tree)) found = t;
    }
    if (found != null) memory.remove(found);
  }

  public void removeLeft(Tree left, Network network) {
    remove(left, leftMemory);
    for (Tree right : rightMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.remove(tree, network);
        }
        for (BetaConnection connection : output) {
          connection.remove(tree, network);
        }
      }
    }
  }

  public void removeRight(Tree right, Network network) {
    remove(right, rightMemory);
    for (Tree left : leftMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.remove(tree, network);
        }
        for (BetaConnection connection : output) {
          connection.remove(tree, network);
        }
      }
    }
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public void setVars(VarTable vars) {
    this.vars = vars;
  }

  public String toString() {
    return "Beta(" + leftMemory + "," + rightMemory + "," + actions + ")";
  }

  public int memoryElementSize() {
    int elements = 0;
    for(Tree t : leftMemory) elements++;
    for(Tree t : rightMemory) elements++;
    for(BetaConnection b : output) {
      elements += b.memoryElementSize();
    }
    return elements;
  }

}
