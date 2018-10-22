package ast.monitors.code;

import java.util.Stack;

import runtime.data.Key;

public class Term extends Code {

  Key name;
  int arity;

  public Term(Key name, int arity) {
    this.name = name;
    this.arity = arity;
  }

  public String toString() {
    return "Term(" + name + "," + arity + ")";
  }

  public boolean run(Stack<Object> stack) {
    Object o = stack.peek();
    if (o instanceof runtime.data.Term) {
      runtime.data.Term term = (runtime.data.Term) o;
      return term.getName() == name && term.getArity() == arity;
    } else return false;
  }

}
