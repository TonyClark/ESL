package runtime.network;

public class BetaConnection {

  Beta      beta;
  Direction direction;

  public BetaConnection(Beta beta, Direction direction) {
    super();
    this.beta = beta;
    this.direction = direction;
  }

  public String toString() {
    return direction + "(" + beta + ")";
  }

  public void add(Tree tree, Network network) {
    switch (direction) {
      case LEFT:
        beta.addLeft(tree, network);
        break;
      case RIGHT:
        beta.addRight(tree, network);
        break;
    }
  }

  public void remove(Tree tree, Network network) {
    switch (direction) {
      case LEFT:
        beta.removeLeft(tree, network);
        break;
      case RIGHT:
        beta.removeRight(tree, network);
        break;
    }
  }

  public int memoryElementSize() {
    return beta.memoryElementSize();
  }
}
