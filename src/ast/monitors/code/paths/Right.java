package ast.monitors.code.paths;

import java.util.Stack;

import runtime.network.Fork;

public class Right extends Path {

  Path path;

  public Right(Path path) {
    this.path = path;
  }

  public Object eval(Object o) {
    Fork fork = (Fork) o;
    return path.eval(fork.getRight());
  }

  public boolean run(Stack<Object> stack) {
    stack.push(eval(stack.pop()));
    return false;
  }

  public String toString() {
    return "Right(" + path + ")";
  }

}
