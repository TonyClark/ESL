package runtime.network;

public class Fork extends Tree {
  
  Tree left;
  Tree right;
  
  public Fork(Tree left, Tree right) {
    super();
    this.left = left;
    this.right = right;
  }
  
  public String toString() {
    return "Fork(" + left + "," + right + ")";
  }

  public boolean equals(Object other) {
    if (other instanceof Fork) {
      Fork fork = (Fork) other;
      return left.equals(fork.left) && right.equals(fork.right);
    } else return super.equals(other);
  }

  public Tree getLeft() {
    return left;
  }

  public Tree getRight() {
    return right;
  }

}
