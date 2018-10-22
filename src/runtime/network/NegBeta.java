package runtime.network;

public class NegBeta extends Beta {

  // Trees coming from the right are negated. Only pass the left-memory
  // elements forward when there is no right-memory element that matches.
  // When a right-memory element is added, any left-memory element that
  // matches must be removed. Removing left-elements just passes through
  // whilst removing right-elements will cause matching left-elements to
  // be added...

  public void addLeft(Tree left, Network network) {
    leftMemory.add(left);
    if (!matchesRight(left)) {
      for (Action action : actions) {
        action.add(left, network, vars);
      }
      for (BetaConnection connection : output) {
        connection.add(left, network);
      }
    }
  }

  private boolean matchesRight(Tree left) {
    for (Tree right : rightMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) return true;
    }
    return false;
  }

  public void addRight(Tree right, Network network) {
    rightMemory.add(right);
    for (Tree left : leftMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.remove(left, network);
        }
        for (BetaConnection connection : output) {
          connection.remove(left, network);
        }
      }
    }
  }

  public void removeLeft(Tree left, Network network) {
    remove(left, leftMemory);
    for (Action action : actions) {
      action.remove(left, network);
    }
    for (BetaConnection connection : output) {
      connection.remove(left, network);
    }
  }

  public void removeRight(Tree right, Network network) {
    remove(right, rightMemory);
    for (Tree left : leftMemory) {
      Tree tree = new Fork(left, right);
      if (eqlChecks(tree) && condition.satisfied(tree, vars)) {
        for (Action action : actions) {
          action.add(left, network, vars);
        }
        for (BetaConnection connection : output) {
          connection.add(left, network);
        }
      }
    }
  }

  public String toString() {
    return "NegBeta(" + leftMemory + "," + rightMemory + "," + actions + ")";
  }

}
