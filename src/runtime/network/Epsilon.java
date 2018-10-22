package runtime.network;

public class Epsilon extends Beta {

  public String toString() {
    return "Epsilon(" + leftMemory + "," + rightMemory + "," + actions + ")";
  }

  public void addLeft(Tree left, Network network) {
    leftMemory.add(left);
    if (condition.satisfied(left, vars)) {
      for (Action action : actions) {
        action.add(left, network, vars);
      }
      for (BetaConnection connection : output) {
        connection.add(left, network);
      }
    }
  }

  public void removeLeft(Tree left, Network network) {
    remove(left, leftMemory);
    if (condition.satisfied(left, vars)) {
      for (Action action : actions) {
        action.remove(left, network);
      }
      for (BetaConnection connection : output) {
        connection.remove(left, network);
      }
    }
  }
}
