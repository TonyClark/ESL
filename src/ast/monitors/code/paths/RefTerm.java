package ast.monitors.code.paths;

import java.util.Stack;

import runtime.data.Term;

public class RefTerm extends Path {

  int index;

  public RefTerm(int index) {
    super();
    this.index = index;
  }

  public String toString() {
    return "Ref(" + index + ")";
  }

  public Object eval(Object o) {
    Term term = (Term)o;
    return term.getValues()[index];
  }

  public boolean run(Stack<Object> stack) {
    stack.push(eval(stack.peek()));
    return true;
  }

}
