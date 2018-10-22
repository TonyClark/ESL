package ast.monitors.code.paths;

import java.util.Stack;

public class Id extends Path {

  public Object eval(Object o) {
    return o;
  }

  public boolean run(Stack<Object> stack) {
    return true;
  }

  public String toString() {
    return "Id";
  }

}
