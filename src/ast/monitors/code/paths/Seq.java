package ast.monitors.code.paths;

import java.util.Stack;

public class Seq extends Path {

  Path first;
  Path second;

  public Seq(Path first, Path second) {
    super();
    this.first = first;
    this.second = second;
  }

  public Object eval(Object o) {
    return second.eval(first.eval(o));
  }

  public boolean run(Stack<Object> stack) {
    stack.push(eval(stack.pop()));
    return true;
  }

  public String toString() {
    return "Seq(" + first + "," + second + ")";
  }

}
