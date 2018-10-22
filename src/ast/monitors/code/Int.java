package ast.monitors.code;

import java.util.Stack;

public class Int extends Code {

  int value;

  public Int(int value) {
    super();
    this.value = value;
  }

  public String toString() {
    return "Int(" + value + ")";
  }

  public boolean run(Stack<Object> stack) {
    Object o = stack.peek();
    return o.equals(value);
  }

}
