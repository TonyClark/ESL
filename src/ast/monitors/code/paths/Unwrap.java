package ast.monitors.code.paths;

import java.util.Stack;

import runtime.network.Just;

public class Unwrap extends Path {

  Path path;

  public Unwrap(Path path) {
    this.path = path;
  }

  public Object eval(Object o) {
    Just just = (Just) o;
    return path.eval(just.getTerm());
  }

  public boolean run(Stack<Object> stack) {
    stack.push(eval(stack.pop()));
    return false;
  }

  public String toString() {
    return "Unwrap(" + path + ")";
  }

}
