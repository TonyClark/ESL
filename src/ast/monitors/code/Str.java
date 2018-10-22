package ast.monitors.code;

import java.util.Stack;

public class Str extends Code {
  
  String value;

  public Str(String value) {
    super();
    this.value = value;
  }

  public boolean run(Stack<Object> stack) {
    Object o = stack.peek();
    return o.equals(value);
  }

}
