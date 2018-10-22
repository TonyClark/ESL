package ast.monitors.code;

import java.util.Stack;

public class Const extends Code {

  Object value;

  public Const(Object value) {
    super();
    this.value = value;
  }

  public String toString() {
    return "Const(" + value + ")";
  }

  public boolean run(Stack<Object> stack) {
    Object o = stack.peek();
    return o.equals(value);
  }

}
