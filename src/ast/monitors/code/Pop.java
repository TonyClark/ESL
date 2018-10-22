package ast.monitors.code;

import java.util.Stack;

public class Pop extends Code {
  
  public String toString() {
    return "Pop";
  }

  public boolean run(Stack<Object> stack) {
    stack.pop();
    return true;
  }

}
